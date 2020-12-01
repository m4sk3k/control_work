public class ex2 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x = x+3;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+"] ");
        }
    }
}