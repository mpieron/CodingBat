package String1;

public class WithoutX {

    public String withoutX(String str) {
        int length = str.length();
        String result = "";

        if(length == 0)
            return "";
        if(str.charAt(0) != 'x')
            result += str.charAt(0);
        if(length > 1){
            result += str.substring(1,length-1);
            if(str.charAt(length-1) != 'x')
                result += str.charAt(length-1);
        }
        return result;
    }
}
