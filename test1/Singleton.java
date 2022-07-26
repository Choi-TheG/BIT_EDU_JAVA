package test1;

public class Singleton {
	private static Singleton singleObject = new Singleton();
	
	private Singleton() {	}
	
	public static Singleton getInstance() {
//		if(singleObject==null) {
//		singleObject = new Singleton();
//		}
		return singleObject;
	}
}
