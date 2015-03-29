package random;
import java.util.*;

public class BubblesortExample {

		public static void main(String args[]){
			int n,c,d,swap;
			Scanner in= new Scanner(System.in);
			
			System.out.println("Enter the numbers of integers to be sorted:");
			n= in.nextInt();
			int array[]= new int[n];
			
			System.out.println("Enter the integers:" +n);
			
			for(c=0;c<n;c++){
				array[c]=in.nextInt();
			}
			
			for(c=0;c<n;c++){
				for(d=0;d<n-c-1;d++){
					if( array[d] > array[d+1]){
						swap= array[d];
						array[d]= array[d+1];
						array[d+1]= swap;
					}
				}
			}
			System.out.println(" The list of sorted numbers are :");
			for(c=0;c<n;c++){
				System.out.println(array[c]);
			}
		}
}