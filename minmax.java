import java.util.Arrays;


public class minmax {
    public static void main(String[] args){
    int[] arr={4,6,1,8,9,12,-4};

    int min=arr[0];
    int max=arr[0];

    //using sort method
    // Arrays.sort(arr);
    // min =arr[0];
    // max=arr[arr.length-1];

    // System.out.println(min);
    // System.out.println(max);



    //using loops
    
    for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println("min is :"+min);
    System.out.println("max is :"+max);

}}
