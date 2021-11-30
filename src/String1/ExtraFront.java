package String1;

public class ExtraFront {

    public String extraFront(String str) {

        String chars = str.length() < 2 ? str : str.substring(0,2);
        return chars.repeat(3);
    }
}
