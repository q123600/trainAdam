public class First {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0 ; i < n ; i += 1){
            for(int b = 0 ; b + i < n - 1 ; b += 1){
            	System.out.print(" ");
            }
            for(int b = n - i ; b - i <= n ; b += 1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
