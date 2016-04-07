package br.com.coursera.array.list.structureddata;

public class CaesarBreaker {

	private static final char MOST_FREQUENT_LETTER_IN_ENGLISH = 'E';

	public static void main(String[] args) {
		String input = "Top ncmy qkff vi vguv vbg ycpx";
//		String encryptedInput = CaesarCipher.encryptTwoKeys(input, 2, 20);
//		System.out.println(encryptedInput);
//		 System.out.println(decryptTwoKeys(input, 2, 20));
//		System.out.println(halfOfString(input, 1));
		 
		 
		 String input2 = "Xifqvximt tsdtlxzrx iijirvtl ek Uybi afvbw yehvv xyi gfqdse iekmfrrpzdrxzse fj xyi "
		 		+ "jzich sw tsdtlxrxzseec xifqvxic, fjkie xmmie zr xyi trwk, xyek klv nsipu rvfyeh yj zw xyvvi-hzqvrjmfrrp "
		 		+ "eeh ulijxzsew lfa xymekj zr xymj nsipu iiceki xf vetl sklvv eii melvvvrkpp xifqvximt. Xrov dsmmek e tzees "
		 		+ "xyvfyxl e hfsi-wvrqv rru gprremek e jcmxlk-gekl xyek rzfmuw gfpcmjmfrj nmkl sklvv ezvgprrvw ej kaf vbrqgpvw."
		 		+ " Zx wyslpu klvvvjfvv esk jyitimji xyek tsdtlxzrx gvftvvkmvw esslx xyiji kvsdikvzg xymekj rru klvmi zrkiietxzse "
		 		+ "rvv tsdqfr-tceti eeh mdtfvkeex. Nlzpv klzw mj jxzpc r mecmu rvxydiex, ni afych pzov ks edieh xyek dsjx sw klv "
		 		+ "xifqvximt hyvwkmfrj giftci gfrtiir xyidwvpmij nmkl lrzv ks hf nmkl lfa xymekj rvv tservgkiu. Mk zw mdtfvkeex "
		 		+ "xyek ymxlnepw eii wljwmtmvrkpp jxiezkyx eeh wdsfxy ks wltgsix xyi himmmek sw wejx grvj, flx eesklvv ijwvrkmrp "
		 		+ "tisgiixp, aymtl av lwlecpp kebi jfv kieexvh, zw xyek ymxlnepw eii gfrkmeyfyj, mehviu tservgkmek E xf S, eeh rfx "
		 		+ "nlwk rtgvfbzqrxvpp. Xyi gfviijtfrumek wlfwmvpu fj gfqgykekmfrrp kvsdikvp zw swxvr vvjvviiu ks ej tsdtlxrxzseec ksgscsxc."
		 		+ " R xsfh tfvkmfr sw fyi vjwsixj dep si gcejwzjziu ks fvpfrx ks xymj jysjzich eeh eii himmie sc egtcmtekmfrj zr e zrvzikc sw "
		 		+ "fxyii wmvpuw, klv gvvhzgkmfr sw klv jxiytxlvv fj jfpuiu gvfxvmew eeh xyi vvgfrjxiytxzse fj llqrr sikrrj sizrx kaf. Xyi lrpcqrvb"
		 		+ " fj slv afvb zw jrwk rpxsimkldw xyek zqgpvqvrk deklvqrxzgrp qfhvpj ks swjvv mewzkyxj zrks eeh eewniiw xf jytl ulijxzsew." 
		 		+ "Av rvv vbgpfvzrx zwjyvw wlgy rw lfa xvgyrzulij wsi jsczzrx gvffcidw grr fv umjgfzvvvh, zqgvfzvh, rrrppdvh, rru uidsewkvrxvh xf "
		 		+ "si gfviitx si ftkmdec. Av vbgitx xf debi pveumek gfrkvzflxzsew me tsdtlxrxzseec xifqvxic, xifqvximt dsuicmek, ueke wkvlgkyiij, "
		 		+ "lzky-giijfvdeegv tsdtlxzrx, M/S-iwjzgziegp wsi vbkiirrp qvqfvp, kvsxvrtymt zrwsiqrxzse jcjxvqj (KZW), fzscsxmtec tsdtlxzrx, eeh hrxr tsdtiijwzse."
		 		+ "Sitelwv fj xyi kvsdikvzg rrxlvv fj xyi tycjmtec nsipu zr aymtl av cmmi, xifqvximt gvffcidw eimji me rrp rvve xyek zrkiietxj nmkl xyi "
		 		+ "tycjmtec nsipu. Kvsdikvzg gfqgykmek jfglwvw se uijmxrzrx, eeeccqmek, rru zqgpvqvrkmek iwjzgziex eckfvzxyqj wsi xifqvximt gvffcidw. Klv "
		 		+ "xifqvximt tsdtlxzrx xvfyg fj xyi hvtrvkqvrk zw mexvveekmfrrpcc vvrfaeiu wsi zxj tseximsykmfrj ks xyi jlruediexrp tisspvqj zr "
		 		+ "gfqgykekmfrrp kvsdikvp, euhiijwzrx dejwzzv ueke qrrrkvqvrk zwjyvw me xifqvximt gvffcidw, rru rtgppmek kvsdikvzg xvgyrzulij ks e "
		 		+ "zrvzikc sw rvvej, megcyumek qfpvglprv fzscsxc, xifqvximt dsuicmek, issskmtw, xifkieglzg mejfvdekmfr wpwkidw, vgfpfkp, eeh tysksemtw."
		 		+ "Xyi kislt etxzzvpp tscprffvrxvw azxy fxyii xvfygw azxyme klv uigeixdiex eeh azxy klv iijirvtlvvj zr sklvv hvtrvkqvrkw ek Uybi."
		 		+ " Klvc gfpcessieki azxy wetycxp zr Qrxyidekmtw, Smfpfkp, Fzstlvqzwkvp, Icitximtec rru Tsdtlxvv Iekzrviimek, rru klv Emtlfprw Wtlfsc "
		 		+ "fj Iezzvfrdiex. Sipseh Hlov, xyi kislt ecwf tscprffvrxvw azxy iijirvtlvvj rx zrvzslw xft mewkmkykij. Fvgryji sw zxj uigxy rru svveuxy, "
		 		+ "xyi kvsdikvzg gfqgykmek kislt ek Uybi mj rvxyrfcc xyi xft kvsdikvzg gfqgykmek kislt me klv eekmfr.";
		 
		 String first = halfOfString(input2, 0);
		 String second = halfOfString(input2, 1);
		 
		 int fistKey = getKey(first);
		 int secondKey = getKey(second);
		 
		 System.out.println("FirstKey: " + fistKey);
		 System.out.println("SecondKey: " + secondKey);
		 System.out.println("Messa decrypted: " + decryptTwoKeys(input2, fistKey, secondKey));
	}

	public static String decryptTwoKeys(String input, int key1, int key2) {
		return CaesarCipher.encryptTwoKeys(input, 26 - key1, 26 - key2);
	}
	
	public static int getKey(String s){
			int [] lettersFrequency = countLetters(s);
			int largestLetterFrequencyIndex = indexOfMax(lettersFrequency);
			int mostFrequentLetterIndex = CaesarCipher.ALPHABET.indexOf(CaesarBreaker.MOST_FREQUENT_LETTER_IN_ENGLISH);
			int key = largestLetterFrequencyIndex - mostFrequentLetterIndex;
			if (key < 0) {
				key = CaesarCipher.ALPHABET.length() - Math.abs(key);
			}
			return key;
	}

	public static String halfOfString(String message, int start) {
		String answer = "";
		for (int k = start; k< message.length() ; k+= 2) {
		     answer = answer + message.charAt(k);    	
		}
		return answer;
	}
	
	public static int[] countLetters(String word) {
		int[] counts = new int [CaesarCipher.ALPHABET.length()];
		
			for (int i = 0; i < word.length(); i++) {
				char letter = word.charAt(i);
				if (Character.isLetter(letter)) {
					int letterIndex = CaesarCipher.ALPHABET.indexOf(Character.toUpperCase(letter));
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
