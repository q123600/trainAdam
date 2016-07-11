
public class MagicMatrix {
	public static void main(String[] args) {
		int n = 13;
		int[] all;
		all =  magicMatrixOrder(n);
		printInProper(all, n);
			}
	
	public static int[] magicMatrixOrder(int n) {
		int[] all = new int [n*n];
		int element = n/2;
		for(int i = 1; i <= n*n; i ++){
			element = findNextIndex(element, all, n, i);
		}
		return all;
	}
	
	public static void printInProper(int[] all, int n) {
		int range = 2;
		int digit = 0;
		while(range < n*n){
			range = range * 10;
			digit += 1;
		}
		
		for(int row = 0; row < n*n; row += n){
			for(int column = 0; column < n; column += 1){
					int range2 = 1;
					int digit2 = 0;
					while(range2 <= all[row + column]){
						range2 = range2 * 10;
						digit2 += 1;
					}
						for(int cd = 0; cd <= digit - digit2; cd += 1){
							System.out.print(" ");
						}
					System.out.print(all[row + column]);
					System.out.print(" | ");
			}
			System.out.println();
		}
	}
	
	public static int findNextIndex(int element, int[] all, int n, int i){
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
		}  // end for loop
		return element;
	}
}
