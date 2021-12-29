package Array1;

public class Make2 {
    public int[] make2(int[] a, int[] b) {
        return switch (a.length){
            case 0 -> new int[]{b[0], b[1]};
            case 1 -> new int[]{a[0], b[0]};
            default -> new int[]{a[0], a[1]};
        };
    }
}
