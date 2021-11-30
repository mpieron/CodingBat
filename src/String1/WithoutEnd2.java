package String1;

public class WithoutEnd2 {

    public String withoutEnd2(String str) {
        int length = str.length();
        return length < 2 ? "" : str.substring(1,length-1);
    }
}
