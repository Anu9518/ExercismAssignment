import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        int start = 0;
        int end = 3;
        List<String> protein = new ArrayList<>();
        String[] proteinArr = new String[]{"Methionine","Phenylalanine","Leucine","Serine","Tyrosine","Cysteine","Tryptophan","STOP"};
        while(start <= rnaSequence.length()-3) {
            String codons = rnaSequence.substring(start, end);
            if(codons.equals("AUG"))
                protein.add(proteinArr[0]);
            else if(codons.equals("UUU") || codons.equals("UUC"))
                protein.add(proteinArr[1]);
            else if(codons.equals("UUA") || codons.equals("UUG"))
                protein.add(proteinArr[2]);
            else if(codons.equals("UCU") || codons.equals("UCC") || codons.equals("UCA") || codons.equals("UCG"))
                protein.add(proteinArr[3]);
            else if(codons.equals("UAU") || codons.equals("UAC"))
                protein.add(proteinArr[4]);
            else if(codons.equals("UGU") || codons.equals("UGC"))
                protein.add(proteinArr[5]);
            else if(codons.equals("UGG"))
                protein.add(proteinArr[6]);
            else if(codons.equals("UAA") || codons.equals("UAG") || codons.equals("UGA"))
                return protein;
            start = start+3;
            end = end +3;

        }
        return protein;

    }
}