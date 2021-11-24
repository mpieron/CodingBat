package Warmup2;

public class CountXX {

    int countXX(String str) {
        int ctr = 0;

        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i, i+2).equals("xx"))
                ctr++;
        }
        return ctr;
    }

}
