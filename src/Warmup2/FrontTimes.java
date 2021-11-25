package Warmup2;

public class FrontTimes {

    public String frontTimes(String str, int n) {
        String front = "";
        String result = "";

        if(str.length() > 3)
            front = str.substring(0,3);
        else
            front = str;

        while(n>0){
            result += front;
            n--;
        }
        return result;
    }

}
