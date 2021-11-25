package String1;

public class StartWord {

    public String startWord(String str, String word) {
        int wordLen = word.length();
        int strLen = str.length();

        if(strLen == 0)
            return "";
        if(strLen >= wordLen && str.substring(1,wordLen).equals(word.substring(1)))
            return str.substring(0,wordLen);
        return "";
    }

}
