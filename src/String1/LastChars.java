package String1;

public class LastChars {

    public String lastChars(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();

        String firstA = lengthA == 0 ? "@" : String.valueOf(a.charAt(0));
        String lastB = lengthB == 0 ? "@" : b.substring(lengthB - 1);
        return firstA + lastB;
    }
}
