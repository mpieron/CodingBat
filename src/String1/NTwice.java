package String1;

public class NTwice {

    public String nTwice(String str, int n) {
        int length = str.length();
        return length*2 < n ? str : str.substring(0,n) + str.substring(length-n);
    }
}
