package com.practice.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("a!b7@z9#k");
		while (m.find()) {
			System.out.println(m.start()+"...."+m.group());
		}

		Pattern p1 = Pattern.compile("[^abc]");
		Matcher m1 = p.matcher("a!b7@z9#k");
		while (m1.find()) {
			System.out.println(m1.start()+"...."+m1.group());
		}
		
		Pattern p2 = Pattern.compile("[a-z]");
		Matcher m2 = p.matcher("a!b7@z9#k");
		while (m2.find()) {
			System.out.println(m2.start()+"...."+m2.group());
		}
		
		Pattern p3 = Pattern.compile("[0-9]");
		Matcher m3 = p.matcher("a!b7@z9#k");
		while (m3.find()) {
			System.out.println(m3.start()+"...."+m3.group());
		}
	}

}
