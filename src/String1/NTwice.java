package String1;

public class NTwice {

    public String nTwice(String str, int n) {
        int length = str.length();

        if(length*2 < n)
            return str;
        return str.substring(0,n) + str.substring(length-n);
    }
}
