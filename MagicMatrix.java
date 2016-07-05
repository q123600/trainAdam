public class First {
	public static void main(String[] args) {
		int n = 13;
		int [] all;
		all =  magicMatrixOrder(n);
		printInProper(all, n);
			}
	public static int [] magicMatrixOrder(int n) {
		int [] all = new int [n*n];
		int element = n/2;
		for(int i = 1; i <= n*n; i ++){
			if(all[element] == 0){
				all[element] = i;
				element -= n;
				if(element < 0){
					int c = element + n*n + 1;
					if(c >= n*n || c < 0 || all[c] != 0){
						element += n;
					}
					else{
						element = c;
					}
				}
				else{
					int c = element + 1;
					if(c % n == 0){
						c -= n;
						if(all[c] == 0){
							element = c;
						}
						else{
							element += n;
						}
					}
					else{
						if(all[c] == 0){
							element = c;
						}
						else{
							element += n;
						}
					}
				}
			} //end first if
			else{
				element += n;
				if(element >= n*n){
					element -= n*n;
					all[element] = i;
				}
				else{
					if(all[element] == 0){
						all[element] = i;
					}
					else{
						element += 1;
						if(element >= n*n){
							element -= n*n;
							all[element] = i;
						}
						else{
							all[element] = i;
						}
					}
				}
				element -= n;
				if(element < 0){
					int c = element + n*n + 1;
					if(c >= n*n || c < 0 || all[c] != 0){
						element += n;
					}
					else{
						element = c;
					}
				}
				else{
					int c = element + 1;
					if(c % n == 0){
						element = c - n;
					}
					else{
						if(all[c] == 0){
							element = c;
						}
						else{
							element += n;
						}
					}
				}
			}
		} // end for loop
		return all;
	}
	public static void printInProper(int [] all, int n) {
		int range = 1;
		int digit = 0;
		if(range < n*n){
			range += 1;
		}
		while(range < n*n){
			range = range * 10;
			digit += 1;
		}
		
		for(int r = 0; r < n*n; r += n){
			for(int c = 0; c < n; c += 1){
					System.out.print(all[r + c]);
					int range2 = 0;
					int digit2 = 0;
					if(range2 < all[r + c] || all[r + c] == 0){
						range2 += 1;
					}
					while(range2 <= all[r + c]){
						range2 = range2 * 10;
						digit2 += 1;
					}
						for(int cd = 0; cd <= digit - digit2; cd += 1){
							System.out.print(" ");
						}
					System.out.print(" | ");
			}
			System.out.println();
		}
	}
}
