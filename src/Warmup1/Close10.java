package Warmup1;

public class Close10 {

    public int close10(int a, int b) {
        int aDifference = Math.abs(10-a);
        int bDifference = Math.abs(10-b);

        if(aDifference < bDifference)
            return a;
        else if(aDifference > bDifference)
            return b;
        return 0;
    }
}
