package com.practice.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo3 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a"); //exactly one "a"
		Matcher m = p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println(m.start()+"...."+m.group());
		}
		
		System.out.println("******************");
		
		Pattern p1 = Pattern.compile("a+"); //Atleast one "a"
		Matcher m1 = p1.matcher("abaabaaab");
		while(m1.find()) {
			System.out.println(m1.start()+"...."+m1.group());
		}
		
		System.out.println("******************");

		Pattern p2 = Pattern.compile("a*"); //Any number of "a" including zero
		Matcher m2 = p2.matcher("abaabaaab");
		while(m2.find()) {
			System.out.println(m2.start()+"...."+m2.group());
		}
		
		System.out.println("******************");
		
		Pattern p3 = Pattern.compile("a?"); //zero or one
		Matcher m3 = p3.matcher("abaabaaab");
		while(m3.find()) {
			System.out.println(m3.start()+"...."+m3.group());
		}
		
		System.out.println("******************");
	}

}
