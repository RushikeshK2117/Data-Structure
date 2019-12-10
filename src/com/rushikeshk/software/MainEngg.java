package com.rushikeshk.software;

public class MainEngg {

	public static void main(String args[]) {
		
		DesktopApp d = new DesktopApp(2);
		d.design();
		d.develope();
		d.test();
		
		WebApp w = new WebApp(1);
		System.out.println(w.equals(d));
	}

}
