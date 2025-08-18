package javaLearning;

public class PaternClass {
    public static void main(String[] args){
        // printing patterns 
        // *****
        // *****
        // *****
        // *****
        // *****
        for(int i =1; i <5; i++){
            for(int j = 1; j<6;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // printing pattern 
        // *****
        // *   *
        // *   *
        // *****

        for(int k =1; k<5; k++){
            if (k == 1 || k == 4) {
                System.out.println("*****");
            }else{
                System.out.println("*   *");
            }
        }
        for(int k = 1; k<=4; k++){
            for(int l =1; l<=5; l++){
                if( k == 1 || l==1 || k==4 || l==5){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // pattern
        // *
        // **
        // ***
        // ****
        for(int i = 1; i<=4; i++){
            for(int j = 4; j>=i;j-- ){
                System.out.print("*");
            }
            System.out.println();
            
        }
            //    *
            //   **
            //  ***
            // ****
        for(int i = 1; i <= 4; i++){
            for(int j=1; j <= 4-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =1; i<=5; i++){
            for(int j = 1; j<6-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
