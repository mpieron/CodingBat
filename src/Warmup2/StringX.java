package Warmup2;

public class StringX {

    public String stringX(String str) {
        int length = str.length();
        String result = "";

        if(length < 3)
            return str;

        for(int i=1; i<length-1; i++){
            char currentChar = str.charAt(i);
            if(currentChar != 'x')
                result += currentChar;
        }
        return str.charAt(0) + result + str.charAt(length-1);
    }
}
