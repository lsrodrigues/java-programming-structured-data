package br.com.coursera.array.list.structureddata;

public class CaesarBreaker {

	private static final char MOST_FREQUENT_LETTER_IN_ENGLISH = 'E';
	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args) {
		String input = "Top ncmy qkff vi vguv vbg ycpx";
		printDecryptedAndEncryptedMessageWithTwoKeys(input, 2, 20);
		System.out.println(halfOfString(input, 1));
		System.out.println("\n" + "------------------------------------" + "\n" );

		String input3 = "Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!";

		String first = halfOfString(input3, 0);
		String second = halfOfString(input3, 1);

		int fistKey = getKey(first);
		int secondKey = getKey(second);

		printTheTwoKeys(fistKey, secondKey);
		CaesarCipherTwo cipherTwo = new CaesarCipherTwo(fistKey, secondKey);
		System.out.println("Message decrypted: " + cipherTwo.decrypt(input3));
	}

	private static void printTheTwoKeys(int fistKey, int secondKey) {
		System.out.println("FirstKey: " + fistKey);
		System.out.println("SecondKey: " + secondKey);
	}

	private static void printDecryptedAndEncryptedMessageWithTwoKeys(
			String input, int key1, int key2) {
		CaesarCipherTwo cipherTwoKeys = new CaesarCipherTwo(key1, key2);
		String decryptedMessage = cipherTwoKeys.decrypt(input);
		String encryptedMessage = cipherTwoKeys.encrypt(decryptedMessage);
		System.out.println(decryptedMessage);
		System.out.println(encryptedMessage);
	}

	public static int getKey(String s) {
		int[] lettersFrequency = countLetters(s);
		int largestLetterFrequencyIndex = indexOfMax(lettersFrequency);
		int mostFrequentLetterIndex = CaesarBreaker.ALPHABET
				.indexOf(CaesarBreaker.MOST_FREQUENT_LETTER_IN_ENGLISH);
		int key = largestLetterFrequencyIndex - mostFrequentLetterIndex;
		if (key < 0) {
			key = CaesarBreaker.ALPHABET.length() - Math.abs(key);
		}
		return key;
	}

	public static String halfOfString(String message, int start) {
		String answer = "";
		for (int k = start; k < message.length(); k += 2) {
			answer = answer + message.charAt(k);
		}
		return answer;
	}

	public static int[] countLetters(String word) {
		int[] counts = new int[CaesarBreaker.ALPHABET.length()];

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (Character.isLetter(letter)) {
				int letterIndex = CaesarBreaker.ALPHABET
						.indexOf(Character.toUpperCase(letter));
				counts[letterIndex]++;
			}
		}

		return counts;
	}

	private static int indexOfMax(int[] lengths) {
		int maxValue = 0;
		int indexMax = 0;
		for (int i = 0; i < lengths.length; i++) {
			if (lengths[i] > maxValue) {
				maxValue = lengths[i];
				indexMax = i;
			}
		}
		return indexMax;
	}
}
