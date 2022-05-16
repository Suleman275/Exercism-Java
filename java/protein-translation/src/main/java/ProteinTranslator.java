import java.util.ArrayList;
import java.util.List;

import javax.lang.model.util.ElementScanner14;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> dna = new ArrayList<String>();
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        for (int i = 0; i < rnaSequence.length(); i = i +3) {
            String codon = rnaSequence.charAt(i) + "";
            codon += rnaSequence.charAt(i+1);
            codon += rnaSequence.charAt(i+2);

            if (codon.equals("AUG")) {
                dna.add("Methionine");
             } else if (codon.equals("UUU") || codon.equals("UUC")) {
                dna.add("Phenylalanine");
             } else if (codon.equals("UUA") || codon.equals("UUG")) {
                dna.add("Leucine");
             } else if (codon.equals("UCU") || codon.equals("UCC") || codon.equals("UCA") || codon.equals("UCG")) {
                dna.add("Serine");
             } else if (codon.equals("UAU") || codon.equals("UAC")) {
                dna.add("Tyrosine");
             } else if (codon.equals("UGU") || codon.equals("UGC")) {
                dna.add("Cysteine");
             } else if (codon.equals("UGG")) {
                dna.add("Tryptophan");
             } else {
                break;
             }
        }

        return dna;
    }
}
