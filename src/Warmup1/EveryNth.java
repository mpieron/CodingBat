package Warmup1;

public class EveryNth {

    public String everyNth(String str, int n) {
        int length = str.length();
        String newStr = "";
        for(int i=0; i<length; i+=n)
            newStr += str.charAt(i);
        return newStr;
    }
}
