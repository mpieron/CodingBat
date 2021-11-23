package Warmup1;

public class StringE {

    public boolean stringE(String str) {
        int ctr = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'e')
                ctr ++;
        }
        return ctr >= 1 && ctr <= 3;
    }
}
