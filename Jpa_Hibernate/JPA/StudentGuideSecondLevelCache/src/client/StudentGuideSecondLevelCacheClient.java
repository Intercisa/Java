package client;

import javax.persistence.Cacheable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;
import org.hibernate.stat.Statistics;

import entity.Guide;

public class StudentGuideSecondLevelCacheClient {

	/*
	 * there will be two select statement if there is two entity manager because
	 * hibernate not cache the persistence objects across different entity managers
	 * 
	 * 
	 * first level cache -> SCOPE -> EntitiyManager!!
	 * 
	 * 
	 * second level cache -> SCOPE -> EntitiyManagaerFactory!!
	 *
	 * ---you have to enable first!--- (enabled in persistance.xml first then in the
	 * Guide.class) 
	 * (in eclipseLink the second level cache is enabled by default)
	 * 
	 * also you want to specify the cache >> ehcache.xml
	 * 
	 * if there is no object in the second level cache >> select statement issued >>
	 * object goes to second level cache when we create another EntityManager it
	 * will look for the object first in the first level cache, if it's not there
	 * than the new EntityManager will look the second level cache
	 * 
	 * also called: Shared Data Cache or Shared Cache
	 * 
	 * in the second level cache there is no object, the data will cached Dehydrated
	 * >> Guide[2] => ["Ian Lamb, 4000, "2000IM10901,1"] >> key-value pairs
	 * 
	 * different caches in second level cache:
	 * 
	 * Entity Data Cache >> Guide Data Cache >> Guide[2] =>
	 * ["Ian Lamb, 4000, "2000IM10901,1"] Collection Cache >> Students Collection
	 * Cache >>Guide[2]#Students=>[1,2] Query Result Cache >>
	 * "select g from Guide g where g.salary > 1000" => [2,3]
	 * 
	 * 
	 * Second level Cache Implementation: hibernate dosen't come with a default
	 * the second level cache provider it's not even enabled default and you have to
	 * choose a provider! example: EhCache >> Single JVM or TreeCache from JBOSS >>
	 * Multiple JVMs
	 * 
	 * 
	 * you can manually invalidating the cached data of a persistent class 
	 * >> emf.evictEntity("entity.Guide"); >> invalidate all elements in entity.Guide region
	 * >>emf.evictEntity("entity.Guide", 2L); >> invalidate only Guide[id=2] in entity.Guide region
	 * 
	 * ---
	 * use Statistics API to see if second level cache is working for us or not
	 * ---
	 * 
	 * default CacheConcurrencyStrategy.READ_WRITE!! >> is equivalent to READ_COMMITTED transaction isolation level >> find more in isolation levels 
	 * 
	 * more Cache Concurrency Strategies:
	 * 
	 * ----------Multiple JVM - TreeCache >> all four strategy
	 * TRANSACTIONAL
	 * cluster, read-mostly data, equivalent to REPEATABLE_READ
	 * 
	 * ----------SINGLE JVM - EhCache >> only three strategy
	 * READ_WRITE
	 * read-mostly data, equivalent to READ_COMMITTED
	 * 
	 * NONSTRICT_READ_WRITE
	 * unlike to modified in the same time or hardly ever changes 
	 * 
	 * READ_ONLY
	 * never modified data: country codes etc. 
	 * 
	 * 
	 * 
	 * Second Level Caching the Associations!
	 * (changes in the Student.class & Guide.class(on the Set!!) & ehcache.xml!)
	 *
	 * in the second level cache the associations are not cacheable by default!
	 * just because we make the Guide.class @Cacheable that does not mean the Student.class is became @Cacheable, it is not! we have to make it @Cacheable
	 * 
	 * we have to enable not only on the class-by-class basis, but the collection-by-collection basis as well
	 * if a persistent object contains associated objects in a collection, the collection can also be cached explicitly(students set in Guide.class and in ehcache.xml)
	 * not just the students data will cached but the students collections will be cached!
	 * 
	 * 
	 */

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");	
		
		Statistics stats = emf.unwrap(SessionFactory.class).getStatistics();
		stats.setStatisticsEnabled(true);
		
		EntityManager em1 = emf.createEntityManager();
		em1.getTransaction().begin();
		 
		System.out.println(emf.getCache().contains(Guide.class, 2L)); //Is Guide[id=2] available in second-level cache?
		Guide guide1 = em1.find(Guide.class, 2L);
		int size1= guide1.getStudents().size(); //students proxy initialized, and goes to the second level cache 
		
		em1.getTransaction().commit();
		em1.close(); 
		
		EntityManager em2 = emf.createEntityManager();
		em2.getTransaction().begin();

		System.out.println(emf.getCache().contains(Guide.class, 2L)); //Is Guide[id=2] available in second-level cache?
		Guide guide2 = em2.find(Guide.class, 2L);
		int size2= guide2.getStudents().size();
		
		em2.getTransaction().commit();
		em2.close(); 		

		System.out.print(stats.getSecondLevelCacheStatistics("entity.Guide")+"\n");
		System.out.println("--------------------");
		System.out.print(stats.getSecondLevelCacheStatistics("entity.Student"));
		
		
		// IMPORTANT!!!!!! FUCKING IMPORTANT!!!!
		if (emf.isOpen())
			emf.close(); // if the program won't terminate, than you have to use this, but use anyway
							// just to be sure!!

	}
}