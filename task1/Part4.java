public class Part4 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0 ; i < n ; i += 1){
            for(int b = 0 ; b <= i && b < n - 1; b += 1){
            	System.out.print("*");
            }
            for(int b = 1 + i; b + i < (n - 1) * 2; b += 1){
            	System.out.print(" ");
            }
            for(int b = (n - 1)*2 - i; b < n*2 - 1; b += 1){
            	System.out.print("*");
            }
            System.out.println();
        }
    }
}
