package String1;

public class FrontAgain {

    public boolean frontAgain(String str) {
        int length = str.length();

        if(length < 2)
            return false;
        else if(length >= 4){
            String front = str.substring(0,2);
            String back = str.substring(length-2);

            return front.equals(back);
        }
        return true;
    }
}
