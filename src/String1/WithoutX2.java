package String1;

public class WithoutX2 {

    public String withoutX2(String str) {
        int length = str.length();
        String result = "";

        if(length == 0)
            return "";
        if(length > 1)
            result += compare(str.substring(0,1));
        if(length >= 2)
            result += compare(str.substring(1,2));
        if(length > 2)
            result += str.substring(2);
        return result;
    }

    private String compare(String currentChar){
        if(currentChar.equals("x"))
            return "";
        return currentChar;
    }
}
