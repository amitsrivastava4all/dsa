public class Reverse {
    // DSA
    static String reverse(String str){
        // Termination case
        if(str.length()==0){
            return "";
        }
        // Small Problem
        return reverse(str.substring(1) ) + str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverse("DSA"));

    }
}
