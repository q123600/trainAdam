public class Part1 {
    public static void main(String[] args) {
        int n = 5;  
        for(int i = 0 ; i < n ; i += 1){
            for(int b = 0 ; b <= i ; b += 1){
            	System.out.print("*");
            }
            System.out.println();
        }
    }
}
