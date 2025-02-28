public class Prob13{

    public static void main(String[] args) {
        int n=4; 
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop for spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //inner loop for stars
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            //inner loop for spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //inner loop for stars
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// Output:

//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *