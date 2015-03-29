package random;

public class Random4 
{

	         public static <T>void printArray( T[] inputArray )
		   {
		               
		         for ( T element : inputArray )
		         {        
		            System.out.printf( "%s ", element );
		         }
		         System.out.println();
		   }

		    public static void main( String args[] )
		      {
		        
		        Integer[] intArray = { 1, 2, 3, 4, 5 };
		        
		        Character[] charArray = { 'J', 'A', 'V', 'A' };

		        System.out.println( "Array integerArray contains:" );
		        printArray( intArray  ); 
		        System.out.println( "\nArray characterArray contains:" );
		        printArray( charArray ); 
		      } 
		

	}


