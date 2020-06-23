package dynamicnullobject;

import java.lang.reflect.Proxy;

/*
 * 
 * Dynamic Null Object
 * 
 */


public class Main {
	public static void main(String[] args) {
		
		Log log = noOp(Log.class);
		BankAccount account = new BankAccount(log);
		
		account.deposit(100);
		
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T noOp(Class<T> itf) {
		return (T) Proxy.newProxyInstance(
				itf.getClassLoader(),
				new Class<?>[] {itf},
				(proxy, method, args) ->{
					if(method.getReturnType().equals(Void.TYPE))
						return null;
					else
						return method.getReturnType().getConstructor().newInstance();
				});
	}

}
