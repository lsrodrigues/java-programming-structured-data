package br.com.coursera.gladlibs.stories.from.template;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.duke.FileResource;

public class CharactersInPlay {

	private ArrayList<String> myWords;
	private ArrayList<Integer> myFreqs;

	public static void main(String[] args) {
		CharactersInPlay chars = new CharactersInPlay();
		FileResource file = new FileResource("C:/Temp/likeit.txt");
		chars.findAllCharacters(file);
		chars.myWords.forEach(s -> {
			System.out.println("\n" + s + "\t"
					+ getFreqIndex(chars.myFreqs, chars.myWords, s));
		});
		System.out.println("--------------------------------------------");
		chars.charactersWithNumParts(10, 15);

	}

	private static Integer getFreqIndex(ArrayList<Integer> chars,
			ArrayList<String> words, String s) {
		return chars.get(words.indexOf(s));
	}

	public CharactersInPlay() {
		myWords = new ArrayList<>();
		myFreqs = new ArrayList<>();
	}

	private void update(String person) {
		int index = myWords.indexOf(person);
		if (index == -1) {
			myWords.add(person);
			myFreqs.add(1);
		} else {
			int value = myFreqs.get(index);
			myFreqs.set(index, value + 1);
		}
	}

	private void findAllCharacters(FileResource file) {
		for (String word : file.lines()) {
			if (word.contains(".")) {
				String words = word.substring(0, word.indexOf("."));
//				String period = String.join("", words);
				update(words);
			}
		}
	}

	private void charactersWithNumParts(int num1, int num2) {
		if (num1 < num2) {
			List<Integer> index = myFreqs.stream()
					.filter(freqIndex -> freqIndex >= num1 && freqIndex <= num2)
					.mapToInt(freqIndex -> myFreqs.indexOf(freqIndex)).boxed()
					.collect(Collectors.toList());
			index.forEach(i -> System.out.println("\n" + myWords.get(i) + "\t"
					+ getFreqIndex(myFreqs, myWords, myWords.get(i))));
		}

	}

}
