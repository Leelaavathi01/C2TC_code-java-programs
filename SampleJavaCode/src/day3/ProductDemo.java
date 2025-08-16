package day3;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p1=new product();
		product p2=new product(281,"hai",45.8f);
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the product details:");
		
		int sid=s.nextInt();
		s.nextLine();
		String prod_name=s.nextLine();
		float price=s.nextFloat();
		product p3=new product(sid,prod_name,price);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		

	}

}
