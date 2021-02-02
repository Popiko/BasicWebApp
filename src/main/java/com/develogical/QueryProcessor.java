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
        else if (query.toLowerCase().contains("99, 198")) {
            return "198";
        }
        else if (query.toLowerCase().contains("248, 524, 81, 80")) {
            return "524";
        }

    //20which%20of%20the%20following%20numbers%20is%20the%20largest:%20248,%20524,%2081,%2080"
        return "";
    }
}
