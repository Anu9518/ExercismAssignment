import java.util.LinkedHashMap;
import java.util.Map;

class RnaTranscription {
    Map<Character,Character> strand = new LinkedHashMap<Character,Character>();
    void initializeStrand() {
        strand.put('G','C');
        strand.put('C','G');
        strand.put('T','A');
        strand.put('A','U');
    }
    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        if(dnaStrand.equals(rnaStrand))
            return rnaStrand;
        initializeStrand();
        char[] dna = dnaStrand.toCharArray();
        for(int i = 0;i < dna.length;i++)
            if(strand.containsKey(dna[i]))
                rnaStrand+=strand.get(dna[i]);
        return rnaStrand;

    }

}
