public class prime{
    public static void main(String args[]){
        int n=6;
        Boolean isPrime=true;

        if(n<=1){
            isPrime=false;

        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        System.out.println(n+(isPrime? "its a prime number":"not a prime"));
    }
}

//efficient code, the time complxity=O(sqrt(n))