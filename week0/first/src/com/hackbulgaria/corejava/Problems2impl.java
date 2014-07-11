package com.hackbulgaria.corejava;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;


public class Problems2impl implements Problems2 {
	
	@Override
	public boolean isOdd(int number) {
		return (number % 2) != 0;
	}

	@Override
	public boolean isPrime(int number) {
		if (number == 1){
			return false;
		} else if (number == 2){
			return true;
		}
		for (int i = 2; i < number; i++){
			if (number % i == 0){
				return false;
			}
		}
		return true;
	}

	@Override
	public int min(int... array) {
		Arrays.sort(array);
		return array[0];
	}

	@Override
	public int kthMin(int k, int[] array) {
		Arrays.sort(array);
		return array[k-1];
	}

	@Override
	public float getAverage(int[] array) {
		float sum = 0;
		for (int i = 0; i < array.length; i++){
			sum = sum + array[i];
		}
		float average = sum / array.length;
		return average;
	}

	@Override
	public long getSmallestMultiple(int upperBound) {
		long result = 1;
        for (int i = 2; i <= upperBound; i++) {
            int[] divisors = getDivisors(i);
            int pointer = 0;
            while (result % i != 0) {
                result *= divisors[pointer++];
            }
        }
        return result;
	}
	
	private static int[] getDivisors(int n) {
        int[] divisors = new int[n];
        int pointer = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                divisors[pointer++] = i;
                n /= i;
                i--;
            }
        }
        return divisors;
    }
	
	public long reverseInt(long n){
		long reverse = 0;
		while( n != 0 ){
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
		return reverse;
	}

	@Override
	public long getLargestPalindrome(long N) {
		for (long i = N; i >= 0; i--){
			if (i == reverseInt(i)){
				return i;
			}
		}
		return 0;
	}

	@Override
	public int[] histogram(short[][] image) {
        int row = image.length;
        int col = image[0].length;
        int[] result = new int[row * col +1];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                result[image[i][j]]++;
            }
        }
        return result;
	}

	@Override
	public long doubleFac(int n) {
		int fac = Fac(n);
		return Fac(fac);
	}
	
	public int Fac(int n){
		int result = 1;
		for (int i = n; i > 0; i--){
			result *= i;
		}
		return result;
	}

	@Override
	public long kthFac(int k, int n) {
		long result = n;
		for (int i = 0; i < k; i++){
			result = Fac(n);
		}
		return result;
	}

	@Override
	public int getOddOccurrence(int[] array) {
		Arrays.sort(array);
		int count = 0;
		int result = array[0];
		for (int i = 0; i < array.length; i++){
			if (array[i] == array[i+1]){
				count += 1;
			}
			else{
				count = 0;
			}
		}
		return result;
	}

	@Override
	public long pow(int a, int b) {
		long result = 1;
		for (int i = 1; i <= b; i++){
			result = result * a;
		}
		return result;
	}

	@Override
	public long maximalScalarSum(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		long result = 0;
		for (int i = 0; i < a.length; i++){
			result += a[i] * b[i];
		}
		return result;
	}

	@Override
	public int maxSpan(int[] array) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean canBalance(int[] array) {
		int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = i; k < array.length; k++) {
                    firstSum += array[j];
                    secondSum = array[k];
                    if (firstSum == secondSum) {
                        return true;
                    }
                }
            }
        }
        return false;
	}

	@Override
	public int[][] rescale(int[][] original, int newWidth, int newHeight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reverseMe(String argument) {
		String result = "";
		for (int i = 0; i < argument.length(); i++) {
		    result = argument.charAt(i) + result;
		}
		return result;
	}

	@Override
	public String copyEveryChar(String input, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reverseEveryWord(String arg) {
		String result = "";
        String[] words = arg.split(" ");
        for (String word: words){
            word = (String)(reverseMe(word));
            result += word + " ";
        }
        return result.substring(0, result.length()-1);
	}

	@Override
	public boolean isPalindrome(String argument) {
		if (argument.equals(reverseMe(argument))){
			return true;
		}
		return false;
	}

	@Override
	public boolean isPalindrome(int number) {
		if (number == reverseInt(number)){
			return true;
		}
		return false;
	}

	@Override
	public int getPalindromeLength(String input) {
		int count = 0;
		String reverseInput = reverseMe(input);
		int length = input.length() / 2;
		for (int i = 0; i < length; i++){
			if (input.charAt(i) == reverseInput.charAt(i)){
				count += 1;
			}
		}
		if (count == 1){
			return 0;
		}
		return count;
	}

	@Override
	public int countOcurrences(String needle, String haystack) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String decodeURL(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sumOfNumbers(String input) {
		String[] numbers = input.split("[a-zA-Z _]+");
		int result = 0;
		for (int i = 0; i < numbers.length; i ++){
			 if (numbers[i].equals("")) {
	                numbers[i] = "0";
	            }
			result += Integer.parseInt(numbers[i]);
		}
		return result;
	}

	@Override
	public boolean areAnagrams(String A, String B) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasAnagramOf(String string, String string2) {
		// TODO Auto-generated method stub
		return false;
	}

}
