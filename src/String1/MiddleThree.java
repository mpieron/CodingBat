package String1;

public class MiddleThree {

    public String middleThree(String str) {
        int half = str.length()/2;
        return str.substring(half-1, half+2);
    }
}
