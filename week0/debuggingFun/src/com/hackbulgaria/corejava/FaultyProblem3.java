package com.hackbulgaria.corejava;


public class FaultyProblem3 {
    
    public String reverseEveryWordInString(String sentence){
    	String result = "";
        String[] words = sentence.split(" ");
        for (String word: words){
            word = (String)(reverse(word));
            result += word + " ";
        }
        
        return result.substring(0, result.length()-1);
    }

    private CharSequence reverse(String word) {
        return Utils.reverseMe(word);
    }
}
