package String1;

public class FirstTwo {

    public String firstTwo(String str) {
        int length = str.length();

        if(length < 2)
            return str;
        return str.substring(0,2);
    }
}
