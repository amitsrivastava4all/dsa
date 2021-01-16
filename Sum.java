public class Sum {
    static int sumOfDigit(int num, int sum){
            // Termination Case
            if(num==0){
                return sum;
            }
            //Processing Logic
            int digit = num % 10;
            sum+=digit;
            num = num/10; // Small Problem
            return sumOfDigit(num, sum); // Recursion
    }
     public static void main(String[] args) {
            int result= sumOfDigit(123, 0);
            System.out.println(result);
    }
}
