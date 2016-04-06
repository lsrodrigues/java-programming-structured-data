package br.com.coursera.array.list.structureddata;

public class CountWords {

	public static void main(String[] args) {
		countWordLengths(new int[6]);
	}

	public static void countWordLengths(int[] counts) {
		String[] words = { "!-Check-!", "marca", "bugs", "pedala", ".peda", "!-Check-!"};
		for (String s : words) {
			
			String checkedWord = checkWord(s);
			countLength(counts, checkedWord);
		}
		for (int i = 0; i < counts.length; i++) {
			if (counts.length - 1 == i) {
				System.out.println("\t Quantidade de palavras com tamanho igual ou maior que " + i + ": " + counts[i]);
			}else{
				System.out.println("\t Quantidade de palavras com tamanho " + i + ": " + counts[i]);
			}
		}
		int lengthMostCommon = indexOfMax(counts);
		System.out.println("\t Quantidade de vezes da palavra que mais se repete no texto:" + lengthMostCommon);

	}

	private static int[] countLength(int[] counts, String checkedWord) {
		int wordSize = checkedWord.length();
		
		if (wordSize < counts.length) {
			counts[wordSize] += 1;
		}
		if (wordSize >= counts.length) {
			counts[counts.length - 1] +=1;  
		}
		return counts;
	}

	private static String checkWord(String s) {
		String correctlyWord = null;
		if (!firstCharIsALetter(s)) {
			correctlyWord = s.substring(1);
		}
		
		if (correctlyWord == null) {
			correctlyWord = s;
		}
		
		if (!lastCharIsALetter(correctlyWord)) {
			correctlyWord = correctlyWord.substring(0, correctlyWord.length() - 1);
		}
		if (correctlyWord == null) {
			return s;
		}
		
		return correctlyWord;
	}

	private static boolean firstCharIsALetter(String s) {
		return Character.isLetter(s.charAt(0));
	}
	
	private static boolean lastCharIsALetter(String s) {
		return Character.isLetter(s.charAt(s.length() - 1));
	}
	
	private static int indexOfMax(int[] lengths) {
		int maxValue = 0;
		for (int i = 0; i < lengths.length; i++) {
			if (lengths[i] > maxValue) {
				maxValue = lengths[i];
			}
		}
		return maxValue;
	}

}
