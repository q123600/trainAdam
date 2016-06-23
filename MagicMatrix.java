
public class MagicMatrix {
	public static void main(String[] args) {
		int n = 3;
		int [] all = new int [n*n];
		int e = 1;
		for(int i = 1; i <= n*n; i ++){
			if(all[e] == 0){
				all[e] = i;
				e -= n;
				if(e < 0){
					int c = e + n*n + 1;
					if(c >= 9 || c < 0 || all[c] != 0){
						e += n;
					}
					else{
						e = c;
					}
				}
				else{
					int c = e + 1;
					if(c % n == 0){
						c -= n;
						if(all[c] == 0){
							e = c;
						}
						else{
							e += n;
						}
					}
					else{
						if(all[c] == 0){
							e = c;
						}
						else{
							e += n;
						}
					}
				}
			} //end first if
			else{
				e += n;
				if(e >= n*n){
					e -= n*n;
					all[e] = i;
				}
				else{
					if(all[e] == 0){
						all[e] = i;
					}
					else{
						e += 1;
						if(e >= n*n){
							e -= n*n;
							all[e] = i;
						}
						else{
							all[e] = i;
						}
					}
				}
				e -= n;
				if(e < 0){
					int c = e + n*n + 1;
					if(c >= 9 || c < 0 || all[c] != 0){
						e += n;
					}
					else{
						e = c;
					}
				}
				else{
					int c = e + 1;
					if(all[c] == 0){
						e = c;
					}
					else{
						e += n;
					}
				}
			}
		} // end for loop
		for(int r = 0; r < 2*n + 1; r += 3){
			for(int c = 0; c < n; c += 1){
				System.out.print(all[r + c]);
			}
			System.out.println();
		}
	}
}
