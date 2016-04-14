package br.com.coursera.gladlibs.stories.from.template;

import java.util.ArrayList;

import edu.duke.FileResource;

public class WordFrequencies {

	private ArrayList<String> myWords;
	private ArrayList<Integer> myFreqs;

	public static void main(String[] args) {
		WordFrequencies wordFreq = new WordFrequencies();
		wordFreq.findUnique();
		System.out.println("Unique words: " + wordFreq.myWords.size());
		for (int i = 0; i < wordFreq.myWords.size(); i++) {
			System.out.println(
					wordFreq.myFreqs.get(i) + "\t" + wordFreq.myWords.get(i));
		}
		int maxFreq = findIndexOfMax(wordFreq.myFreqs);
		String wordFound = wordFreq
				.getWordThatHaveMostFrequence(wordFreq.myWords, maxFreq);

		// String wordFound2 =
		// wordFreq.getWordThatHaveMostFrequence(wordFreq.myWords, maxFreq);

		System.out.println(
				"A palavra que ocorre na maioria das vezes e sua contagem são: "
						+ wordFound + "\t" + maxFreq);

	}

	public WordFrequencies() {
		myWords = new ArrayList<>();
		myFreqs = new ArrayList<>();
	}

	public void findUnique() {
		myWords.clear();
		myFreqs.clear();
		FileResource file = new FileResource("C:/Temp/romeo.txt");
		// String [] file = {"This", "is", "a", "test.", "Yes", "a", "test",
		// "of", "a", "test.", "Test."};
		for (String word : file.words()) {
			int index = myWords.indexOf(word.toLowerCase());
			if (index == -1) {
				myWords.add(word);
				myFreqs.add(1);
			} else {
				int value = myFreqs.get(index);
				myFreqs.set(index, value + 1);
			}
		}
	}

	public String getWordThatHaveMostFrequence(ArrayList<String> words,
			int indexOfWord) {
		return words.get(indexOfWord);
	}

	private static int findIndexOfMax(ArrayList<Integer> lengths) {
		int maxValue = 0;
		int indexMax = 0;

		for (int i : lengths) {
			if (i > maxValue) {
				maxValue = i;
				indexMax = lengths.indexOf(maxValue);
			}
		}

		return indexMax;
	}

}
