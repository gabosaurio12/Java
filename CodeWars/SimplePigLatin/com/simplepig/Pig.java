package com.simplepig;

public class Pig {

    public String borrarChar(String str, int pos) {
        StringBuilder strAux = new StringBuilder(str);
        strAux.delete(pos, pos + 1);

        return strAux.toString();
    }
    
    public String pigLatin(String s) {
    	StringBuilder strFinal = new StringBuilder();
    	int i = 0;
    	while (i < s.length()) {
    		int f = s.indexOf(' ', i);
            if (f == -1) {
                f = s.length();
            }

            String strAux = s.substring(i,f);
            char l = strAux.charAt(0);
            strAux = borrarChar(strAux, 0);
            strAux = strAux.concat(l + "ay");

            if (f < s.length())
                strFinal.append(strAux + " ");
            else
                strFinal.append(strAux);
            
    		i = f + 1;
    	}

    	return strFinal.toString();
    }
}