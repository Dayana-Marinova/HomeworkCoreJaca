package com.hackbulgaria.corejava;

public class FaultyProblem4 {
	private final static double EPSILON = 0.00001;
    public static boolean areEqual(Integer e, Integer k) {
        return e.equals(k);
    }

    public static boolean areEqual(float a, float b) {
        return Math.abs(a - b) < EPSILON ? true: false;	
    }

    public static boolean haveEqualSubstrings(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            String substringA = a.substring(i, a.length() - 1);
            String substringB = b.substring(i, a.length() - 1);
            if (substringA.equals(substringB)){
                return true;
            }
        }
        return false;
    }
}
