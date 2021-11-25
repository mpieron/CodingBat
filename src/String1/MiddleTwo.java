package String1;

public class MiddleTwo {

    public String middleTwo(String str) {
        int half = str.length()/2 -1;
        return str.substring(half,half+2);
    }
}
