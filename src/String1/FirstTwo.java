package String1;

public class FirstTwo {

    public String firstTwo(String str) {
        return str.length() < 2 ? str : str.substring(0,2);
    }
}
