package String1;

public class WithoutX {

    public String withoutX(String str) {
        int length = str.length();

        if(length == 0)
            return "";

        int start = str.startsWith("x") ? 1 : 0;
        int end = 1;

        if(length > 1)
            end = str.endsWith("x") ? length-1 : length;

        return  str.substring(start, end);
    }
}
