package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client c1 = new Client("Maria", "maria@mail.com");
		Client c2 = new Client("Alex", "alex@mail.com");
		Client c3 = new Client("Maria", "maria@mail.com");
		
		String s1 = "Test";
		String s2 = "Test";

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		System.out.println(c1 == c3);
		System.out.println(s1 == s2);

	}

}
