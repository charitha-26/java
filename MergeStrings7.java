//7.	Given two strings s1 and s2, your task is to merge those strings to form a new merged string. A merge operation on two strings is described as follows: Append alternating characters from s1 and s2, respectively, to merged String. Once all of the characters in one of the strings have been merged, append the remaining characters in the other string to merged String

import java.util.Scanner;
public class MergeStrings7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings : ");
		String word1 = sc.next();
		String word2 = sc.next();
		String newStr = "";
		int minLen = 0;
		if(word1.length() < word2.length()){
			minLen = word1.length();
		}
		else{
			minLen =  word2.length();
		}
		
		for(int idx = 0; idx < minLen; idx++) {
			newStr += word1.charAt(idx) + "" + word2.charAt(idx);
		}
		if(minLen < word1.length()) {
			for(int idx = minLen; idx < word1.length();idx++) {
				newStr += word1.charAt(idx);
			}
		}	
		if(minLen < word2.length()) {
			for(int idx = minLen; idx < word2.length();idx++) {
				newStr += word2.charAt(idx);
			}
		}
		System.out.println(newStr);
		sc.close();
	}
}
