package com.numromano;

public class Conversion {

    public String solution(int n) {
    	int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    	String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    	String str = "";
    	int i = 0;
    	while (n > 0) {
    		while (n >= valores[i]) {
    			str = str.concat(simbolos[i]);
    			n -= valores[i];
    		}
    		i++;
    	}

    	return str;
    }
}
