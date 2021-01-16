public class Two {

    static void printIt(int i){
        // Termination Case or Base Case
        if(i==0){
            return;
        }
        if(i%2==0){
        System.out.println(i);
        }
        printIt(i-1);
        if(i%2!=0){
        System.out.println(i);
        }

    }
    public static void main(String[] args) {
        printIt(10);
    }

}
