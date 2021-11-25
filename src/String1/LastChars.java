package String1;

public class LastChars {

    public String lastChars(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();

        if(lengthA == 0 && lengthB != 0)
            return "@" + b.substring(lengthB-1);
        else if(lengthA != 0 && lengthB == 0)
            return a.charAt(0) + "@";
        else if(lengthA == 0)
            return "@@";
        return a.charAt(0) + b.substring(lengthB-1);
    }
}
