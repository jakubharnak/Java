package fibonacci_harnak;

	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Fibonacciho cislo na vypis");
	        int n = scanner.nextInt();
	        
	        System.out.println("Prvych " + n + " fibonacciho cisel je:");
	        for (int i=1; i <= n; i++){
	            System.out.println(nf(i));
	        }  
	        scanner.close();
		 
	    }	    
	    public static int nf(int num) {

	        if (num == 0) {
	            return 0;
	        }
	        else if(num == 1)
	        {
	            return 1;
	        }
	     
	       return nf(num-1) + nf(num-2);
	    }
	}