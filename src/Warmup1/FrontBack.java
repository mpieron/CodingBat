package Warmup1;

public class FrontBack {

    public String frontBack(String str) {
        int length = str.length();

        if(length >= 2)
            return str.charAt(length-1) + str.substring(1,length-1) + str.charAt(0);
        return str;
    }
}
