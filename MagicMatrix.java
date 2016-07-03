
public class magicMatrix {
	public static void main(String[] args) {
		int n = 13;
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
		for(int r = 0; r < n*n; r += n){
			for(int c = 0; c < n; c += 1){
				if(all[r + c] < 10){
					System.out.print(all[r + c]);
					System.out.print(" ");
					System.out.print(" | ");
				}
				else{
					System.out.print(all[r + c]);
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
	}
}
