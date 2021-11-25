package String1;

public class TwoChar {

    public String twoChar(String str, int index) {
        int length = str.length();

        if(length == 2)
            return str;
        else if(length-2 < index || index < 0)
            return str.substring(0,2);
        return str.substring(index, index+2);
    }
}
