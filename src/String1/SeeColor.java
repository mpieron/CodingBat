package String1;

public class SeeColor {

    public String seeColor(String str) {
        int length = str.length();

        if(length < 3)
            return "";

        else if(str.substring(0,3).equals("red"))
            return "red";
        else if(length > 3 && str.substring(0,4).equals("blue"))
            return "blue";
        return "";
    }
}
