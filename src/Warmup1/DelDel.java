package Warmup1;

public class DelDel {

    public String delDel(String str) {
        int index = str.indexOf("del");

        if(index == 1)
            return str.substring(0,index) + str.substring(index+3);
        return str;
    }
}
