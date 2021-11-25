package Warmup2;

public class StringMatch {

    public int stringMatch(String a, String b) {
        int ctr = 0;
        int length = Math.min(a.length(), b.length());

        for(int i=0; i<length-1; i++){
            if(a.substring(i,i+2).equals(b.substring(i,i+2)))
                ctr++;
        }
        return ctr;
    }

}
