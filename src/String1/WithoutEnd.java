package String1;

public class WithoutEnd {

    public static String withoutEnd(String str) {
        if(str.length() == 0)
            return str;
        return str.substring(1,str.length()-1);
    }
}
