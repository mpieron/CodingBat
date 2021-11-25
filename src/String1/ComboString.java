package String1;

public class ComboString {

    public  String comboString(String a, String b) {
        if(a.length() > b.length()){
            String tmp = a;
            a = b;
            b = tmp;
        }
        return a + b + a;
    }
}
