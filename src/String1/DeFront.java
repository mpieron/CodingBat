package String1;

public class DeFront {

    public String deFront(String str) {
        int length = str.length();
        if(length == 0)
            return "";
        else if(length == 1)
            return aOrB(str.substring(0,1), "a");
        return aOrB(str.substring(0,1), "a") + aOrB(str.substring(1,2), "b") + str.substring(2);
    }

    private String aOrB(String currentChar, String aorb){
        if(currentChar.equals(aorb))
            return currentChar;
        return "";
    }
}
