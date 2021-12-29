package Array1;

public class Start1 {
    public int start1(int[] a, int[] b) {
        int ctr = 0;
        if(a.length > 0 && a[0] == 1)
            ctr++;
        if(b.length > 0 && b[0] == 1)
            ctr++;
        return ctr;
    }
}
