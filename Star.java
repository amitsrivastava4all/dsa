public class Star {

    // static void  printStar(int start, int end){
    //     if(start == end){
    //         System.out.print("*");
    //         System.out.println();
    //         return ;
    //     }
    //     System.out.print("*");
    //     printStar(start+1, end);

    // }

    static void  printStar(int noOfStars){
        if(noOfStars==0){

            System.out.println();
            return ;
        }
        System.out.print("*");
        printStar(noOfStars-1);

    }

    static void pattern(int noOfRows, int noOfStars){
        if(noOfRows==0){
            return;
        }
        //noOfStars = noOfStars+1;
        printStar(noOfStars);
        noOfStars = noOfStars + 1;
        pattern(noOfRows-1, noOfStars);
        // printStar(1,1);
        // printStar(1,2);
        // printStar(1,3);
        // printStar(1,4);
        // printStar(1,5);
    }

    public static void main(String[] args) {

       pattern(5,1);

    }
}
