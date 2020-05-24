package bookstoreclient;


import java.util.ArrayList;
import java.util.List;

import com.udemy.JpaAndHiberanate.BookStore.Book;
import com.udemy.JpaAndHiberanate.BookStore.Chapter;
import com.udemy.JpaAndHiberanate.BookStore.Publisher;

public class BookStoreClient {
	
	public static void main(String[] args) {
		BookStoreService bookStoreService = new BookStoreService();
		
	
		Publisher publisher = new Publisher("MANN", "Manning Publication Co.");
		
		Book book = new Book("981736478263817", "Java Persistence with Hibernate, Second Edition", publisher);
		
		List<Chapter> chapters = new ArrayList<Chapter>();
		Chapter chapter1 = new Chapter("Introducing JAP and Hibernate",1);
		chapters.add(chapter1);
		Chapter chapter2 = new Chapter("Domain Models and Metadata",1);
		chapters.add(chapter2);
		
		book.setChapters(chapters);
				
		bookStoreService.persistObjectGraph(book);
		
		
		Book bookRet = bookStoreService.retriveObjectGraph("981736478263817");
		System.out.println(bookRet);
		
		
		
	}

}
