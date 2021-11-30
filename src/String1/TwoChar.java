package String1;

public class TwoChar {

    public String twoChar(String str, int index) {
        int length = str.length();
        return (length-2 < index || index < 0) ? str.substring(0,2) : str.substring(index, index+2);
    }
}
