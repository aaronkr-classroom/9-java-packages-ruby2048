package com.section03;
import java.util.Date;

public class Ex1010 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		long ms = System.currentTimeMillis();
		System.out.println("현재 ms : " + ms);
		
		Date d2 = new Date(ms);
		System.out.println(d2);
		
		Date this_bday = new Date(2024, 05, 11);
		Date my_bday = new Date(2004, 05, 11);
		
		boolean after = this_bday.after(my_bday);
		boolean before = this_bday.before(my_bday);
		
		System.out.println(this_bday);
		System.out.println("after : " + after);
		System.out.println("before : " + before);
	}

}
