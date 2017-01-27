package br.com.coursera.gladlibs.stories.from.template;

import java.util.HashMap;
import java.util.Map;

public class DNAMap {

	public static void main(String[] args) {
		Map<String, Integer> codons = null;
		String dna = "CGTTCAAGTTCAA";
		DNAMap map = new DNAMap(codons);
		map.buildCodonMap(2, dna);

	}

	private Map<String, Integer> codons;

	public DNAMap(Map<String, Integer> codons) {
		this.codons = new HashMap<>();
	}

	private void buildCodonMap(int start, String dna) {
		String codon = null;
		for (int i = 0; i < dna.length(); i++) {
			if (dna.length() >= 3 && dna.length() >= start + 3) {
				codon = dna.substring(start, start + 3);
				dna = dna.substring(3, dna.length());

				if (isCodon(codon)) {
					putCodonsMap(codon);
				}
			}

		}

		printScoreCodons();
	}

	private void putCodonsMap(String codon) {
		Integer value = codons.get(codon);
		if (value == null) {
			value = 0;
		}
		value++;
		codons.put(codon, value);
	}

	private boolean isCodon(String codon) {
		char lastElement = codon.charAt(codon.length() - 1);
		if (Character.isLetter(lastElement)) {
			return true;
		}
		return false;
	}
	
	private void printScoreCodons() {
		for (Map.Entry<String, Integer> entry : codons.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}
}
