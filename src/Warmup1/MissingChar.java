package Warmup1;

public class MissingChar {

    public String missingChar(String str, int n) {
        if(str.length() >= n)
            return str.substring(0,n) + str.substring(n+1);
        return str;
    }
}
