package Warmup2;

public class Last2 {

    public int last2(String str) {
        int ctr = 0;
        if(str.length() > 3){
            String twoChars = str.substring(str.length()-2);
            for(int i=0; i<str.length()-2; i++){
                if(str.substring(i,i+2).equals(twoChars))
                    ctr++;
            }
        }
        return ctr;
    }
}
