import java.util.Arrays;
public class minmax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int i;
        int minsum = 0;
        int maxsum = 0;
        for(i=0; i<arr.length-1; i++){
            minsum += arr[i];
        }
        for(i=1; i<arr.length; i++){
            maxsum += arr[i];
        }
        System.out.print(minsum+" "+maxsum);
    }
}
