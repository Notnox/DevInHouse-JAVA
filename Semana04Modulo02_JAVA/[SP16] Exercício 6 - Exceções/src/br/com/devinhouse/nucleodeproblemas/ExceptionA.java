package br.com.devinhouse.nucleodeproblemas;

public class ExceptionA extends Exception {
	public static void foo(String x){
		try {
			System.out.println("First character: " + x.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException thrown! - " + e);
		}
	}
}
