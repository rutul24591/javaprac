package random;

public class TransposeMatrix 
	{
		public static void main( String[] arg)
		{
			final int[][] oldmatrix = new int[][]{{2,3,3},{3,6,5,},{5,7,8}};
		
			for(int i=0; i < oldmatrix.length;i++)
				{
					for(int j=0;j< oldmatrix[i].length;j++)
						
						{
						System.out.println(oldmatrix[i][j]+"");
						}		
				
				System.out.println("\n");
				}
			System.out.println("\n");
		System.out.println("transposed matrix:");
		final int[][] TransposedMatrix = new int[][]{{2,3,5},{3,6,7},{3,5,8}};
		
		// transposed matrix	
		if(oldmatrix.length >0)
		{
			for(int i=0;i < oldmatrix[0].length;i++)
			{	
				for(int j=0;j < oldmatrix.length;j++)
				{ 		
					TransposedMatrix[i][j]= oldmatrix[i][j];
				}
			}
		}
		System.out.println("\n");
			for(int i=0; i< TransposedMatrix.length;i++)
				{
					for(int j=0; j< TransposedMatrix[i].length;j++)
					{
						System.out.println(TransposedMatrix[i][j]+"");
					}
					System.out.println("\n");
				}
	}			

	
}		
		
		
		
		
		
	
