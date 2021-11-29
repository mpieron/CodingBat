package String1;

public class ExtraEnd {

    public String extraEnd(String str) {
        String word = str.substring(str.length()-2);
        return word.repeat(3);
    }
}
