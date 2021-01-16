public class Fact {

    static int fact(int n){
        if(n == 1){
            return 1;
        }
        int smallResult = fact(n-1);
        return n * smallResult;

    }

    static int power(int num, int n){
        if(n == 0){
            return 1;
        }
        // int smallResult = power(num,n-1);
        // return num * smallResult;
        return  num * power(num, n-1);

    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
