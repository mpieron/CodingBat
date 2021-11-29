package String1;

public class HasBad {

    public boolean hasBad(String str) {
        int indexBad = str.indexOf("bad");
        return (indexBad == 0 || indexBad == 1);
    }
}
