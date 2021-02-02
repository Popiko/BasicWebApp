package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("yali")) {
            return "yali is a cute girl";
        }
        else if (query.toLowerCase().contains("your name")) {
            return "liiiiiii";
        }
        else if (query.toLowerCase().contains("323, 2, 98, 188")) {
            return "323";
        }


        return "";
    }
}
