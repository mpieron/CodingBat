package Warmup2;

public class StringTimes {

    public String stringTimes(String str, int n) {
        String result = "";

        while(n>0){
            result += str;
            n--;
        }
        return result;
    }
}
