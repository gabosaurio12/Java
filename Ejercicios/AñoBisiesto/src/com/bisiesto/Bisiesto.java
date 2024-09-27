package com.bisiesto;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    boolean flag = false;
	    int year;
	    year = scn.nextInt();

	    if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
	    	flag = true;
	    }

	    if (flag)
	    	System.out.println("Es bisiesto");
	    else
	    	System.out.println("No es bisiesto");
	}
}
