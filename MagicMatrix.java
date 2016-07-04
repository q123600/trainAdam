
public class MagicMatrix {
	public static void main(String[] args) {
		magicMatrix();
			}
	public static void magicMatrix() {
		int n = 113;
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
		int z = 1;
		while(z > n*n){
			z = z * 10;
		}
		for(int r = 0; r < n*n; r += n){
			for(int c = 0; c < n; c += 1){
					System.out.printf("%03d ", all[r + c]);
					System.out.print(" | ");
			}
			System.out.println();
		}
	}
}
