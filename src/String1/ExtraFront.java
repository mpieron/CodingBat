package String1;

public class ExtraFront {

    public String extraFront(String str) {
        String chars = "";

        if(str.length() < 2)
            chars = str;
        else
            chars = str.substring(0,2);
        return chars + chars + chars;
    }
}
