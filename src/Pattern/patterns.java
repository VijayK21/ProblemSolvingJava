package Pattern;

public class patterns {

	public static void main(String[] args) {
		pattern15(5);
	}

	static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
	
	static void pattern4(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	static void pattern5(int n) {
		for (int i = 0; i <n; i++) {
			for (int j = n; j >i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern6(int n) {
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n-i; j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern7(int n) {
		/*
		         *     (4,1,4)       space,star,space 
		        ***	   (3,3,3)		(n-i-1),(i*2+1),(n-i-1)
		       *****   (2,5,2)
		      *******  (1,7,1)
		     ********* (0,9,0)
		*/
		for (int i = 0; i < n; i++) {

			for (int space = 0; space < n - i - 1; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < i * 2 + 1; star++) {
				System.out.print("*");
			}
			for (int space = 0; space < n - i - 1; space++) {
				System.out.print(" ");
		}
			System.out.println();
	}
	}
	
	static void pattern8(int n) {
		/*
		        ********* (0,9,0)  (n-i-1),(i*2+1),(n-i-1)
		         *******  (1,7,1)
		          *****   (2,5,2)
		           ***	   (3,3,3)	
		            *     (4,1,4)       space,star,space     
		     
		*/
		for (int i = n; i > 0; i--) {

			for (int space = 0; space <= n - i - 1; space++) {    
				System.out.print(" ");
			}
			for (int star = 0; star < i * 2 - 1; star++) {
				System.out.print("*");
			}
			for (int space = 0; space <= n - i - 1; space++) {
				System.out.print(" ");
		}
			System.out.println();
	}
	}
	
	static void pattern9(int n) {
	/*
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
		* * * * 
		* * * 
		* * 
		* 
	 */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <n; i++) {
			for (int j = n; j >i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	static void pattern10(int n) {
		/*
			1
			01
			101
			0101
			10101
			 
		 */
			for (int i = 1; i <=n; i++) {
				String state = "";
				if(i%2==0) {
					state="Even";
				}
				else {
					state="Odd";
				}
				for (int j = 1; j <=i; j++) {
					if(state.equalsIgnoreCase("Even")& j%2==0 || state.equalsIgnoreCase("Odd")& j%2!=0 ) {
						System.out.print("1 ");
					}
					else {
						System.out.print("0 ");
					}
				}
				System.out.println();
			}
			
		}
	
	static void pattern11(int n) {
		/*					
			1      1       		   
			12    21			    
			123  321                
			12344321	 
		 */
			for (int i = 1; i <n; i++) {
				for(int j = 1 ; j<=i ; j++) {
					System.out.print(j);
				}
				for(int k = i+1 ; k<n ; k++) {
					System.out.print(" ");
				}
				for(int l = i+1 ; l<n ; l++) {
					System.out.print(" ");
				}
				for(int m = i ; m>=1 ; m--) {
					System.out.print(m);
				}
				System.out.println();
		}
			
}
	
	static void pattern12(int n) {
		/*
		    1 
			2 3 
			4 5 6 
			7 8 9 10 
			11 12 13 14 15 
		 */
		int num =1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	
	static void pattern13(int n) {
		/*
		    A 
			A B 
			A B C 
			A B C D 
			A B C D E 
	    */
		String[] alphabets = {"A","B","C","D","E"};
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(alphabets[j]+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern14(int n) {
		/*
		    A B C D E 
			A B C D 
			A B C 
			A B 
			A  
	    */
		String[] alphabets = {"A","B","C","D","E"};
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j >=i; j--) {
				System.out.print(alphabets[n-j-1]+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern15(int n) {
		/*
		    A 
			A B 
			A B C 
			A B C D 
			A B C D E 
	    */
		String[] alphabets = {"A","B","C","D","E"};
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(alphabets[i]+" ");
			}
			System.out.println();
		}
	}
	
}