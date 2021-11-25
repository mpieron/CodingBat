package String1;

public class WithouEnd2 {

    public String withouEnd2(String str) {
        int length = str.length();

        if(length < 2)
            return "";
        return str.substring(1,length-1);
    }
}
