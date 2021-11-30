package String1;

public class StartWord {

    public String startWord(String str, String word) {
        int wordLen = word.length();
        int strLen = str.length();
        return (strLen >= wordLen && str.substring(1,wordLen).equals(word.substring(1))) ? str.substring(0,wordLen) : "";
    }
}
