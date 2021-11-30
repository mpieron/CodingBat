package String1;

public class LastTwo {

    public String lastTwo(String str) {
        int length = str.length();
        return length < 2 ? str : str.substring(0,length-2) + str.charAt(length-1) + str.charAt(length-2);
    }
}
