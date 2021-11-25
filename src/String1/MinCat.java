package String1;

public class MinCat {

    public String minCat(String a, String b) {
        int length = Math.min(a.length(), b.length());
        return a.substring(a.length()-length) + b.substring(b.length()-length);
    }
}
