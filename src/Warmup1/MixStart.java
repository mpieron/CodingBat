package Warmup1;

public class MixStart {

    public boolean mixStart(String str) {
        if(str.length() >= 3)
            return (str.substring(1,3).equals("ix"));
        return false;
    }
}
