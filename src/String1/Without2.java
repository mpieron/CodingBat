package String1;

public class Without2 {

    public String without2(String str) {
        int length = str.length();
        if(length == 2)
            return "";
        else if(length > 2 && str.substring(0,2).equals(str.substring(length-2)))
            return str.substring(2);
        return str;
    }
}
