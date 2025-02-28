public class Prob12 {
    public static void main(String[] args) {
        int n=5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop for spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //inner loop for stars
            for(int k=1; k<=n; k++){
                if(k==1||k==n||i==1||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
