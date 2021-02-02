package com.develogical;

import java.util.Locale;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("yali")) {
            return "yali is a cute girl";
        } else if (query.toLowerCase().contains("your name")) {
            return "liiiiiii";
        } else if (query.toLowerCase().contains("multiplied by")) {
            // %20what%20is%2017%20multiplied%20by%209
            String str = query.toLowerCase();
            str = str.replaceAll("[^-?0-9]+", " ");
            String[] a = str.trim().split(" ");
            int one = Integer.parseInt(a[0]);
            int two = Integer.parseInt(a[1]);
            //return String.valueOf(one*two);
            return Integer.toString(one*two);

        }
        else if (query.toLowerCase().contains("the largest")) {
            String str = query.toLowerCase();
            str = str.replaceAll("[^-?0-9]+", " ");
            String[] a = str.trim().split(" ");
            int temp = Integer.parseInt(a[0]);
            int index = 0;
            for (int i = 0; i < a.length; i++) {
                if (Integer.parseInt(a[i]) > temp) {
                    temp = Integer.parseInt(a[i]);
                    index = i;

                }
            }
            return a[index];
        }
        else if (query.toLowerCase().contains("plus")) {
            //what is 0 plus 16
            String str = query.toLowerCase();
            str = str.replaceAll("[^-?0-9]+", " ");
            String[] a = str.trim().split(" ");
            int one = Integer.parseInt(a[0]);
            int two = Integer.parseInt(a[1]);
            return String.valueOf(one+two);
        }
        return "";
    }




}
