package String1;

public class Right2 {

    public String right2(String str) {
        int end = str.length()-2;
        return str.substring(end) + str.substring(0,end);
    }
}
