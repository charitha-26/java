//6.	Write a java program to find whether given sentence is Pangram or not. If it is pangram, then print 1 else print -1.A pangram is a sentence containing every letter in the English Alphabet. Ex: The quick brown fox jumps over the lazy Dog.
import java.util.*;
public class IsPangram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[]  alphabets = new boolean[26];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine();
		sentence = sentence.toLowerCase();
		
		for(int idx = 0; idx < sentence.length();idx++) {
			char chr = sentence.charAt(idx);
			if(chr >= 'a' && chr <= 'z'){
					alphabets[chr - 'a'] = true;
			}
		}
		
		boolean isPangram = true;
		
		for(int idx = 0; idx < 26; idx++) {
			if(!alphabets[idx]) {
				isPangram = false;
				break;
			}
		}
		
		if(isPangram) {
			System.out.println("Pangram");
		}
		else {
			System.out.println("Not a Pangram");
		}

	}

}
