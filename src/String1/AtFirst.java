package String1;

public class AtFirst {

    public String atFirst(String str) {

        if(str.length() == 0)
            return "@@";
        return str.length() == 1 ? str + "@" : str.substring(0,2);
    }
}
