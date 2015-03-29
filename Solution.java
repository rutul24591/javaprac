package random;

public class Solution{
	public static void main(String args[]){
		int [][]A = new int[1000][1000];
		
		int cnt = 0;
		int curr_cnt = 0;
		for(int x=0; x< A.length;x++){
			for(int y=0; y< A[x].length; y++){
				A[x][y]= (int) Math.round(Math.random());
			}
		}
		System.out.println(A);
		for(int x=0;x< A.length;x++){
			for(int y=0; y< A[x].length; y++){
				if(A[x][y] == 1){
					curr_cnt=0;
					cnt= cnt + clean_block(A,x,y, curr_cnt);
				}
			}
		}
		System.out.println(cnt);
	}

	public static int clean_block(int A[][],int x_in, int y_in,int curr_cnt){
		
		A[x_in][y_in]=0;
		if (coordinate_exists(x_in -1,y_in, A.length, A[0].length) == 1 && A[x_in-1][y_in  ] == 1) {clean_block(A,x_in-1,y_in  ,curr_cnt); curr_cnt = 1;}
		if (coordinate_exists(x_in +1,y_in, A.length, A[0].length) == 1 && A[x_in+1][y_in  ] == 1) {clean_block(A,x_in+1,y_in  ,curr_cnt); curr_cnt = 1;}
		if (coordinate_exists(x_in,y_in -1, A.length, A[0].length) == 1 && A[x_in  ][y_in-1] == 1) {clean_block(A,x_in  ,y_in-1,curr_cnt); curr_cnt = 1;}
		if (coordinate_exists(x_in,y_in +1, A.length, A[0].length) == 1 && A[x_in  ][y_in+1] == 1) {clean_block(A,x_in  ,y_in+1,curr_cnt); curr_cnt = 1;}
		return curr_cnt;
		
	}
	
	public static int coordinate_exists(int x_in,int y_in, int A_x_length, int A_y_length){
		if (x_in >= 0 && x_in <= (A_x_length-1) && y_in >= 0 && y_in <= (A_y_length-1)) {
    		return 1;
    	}
		else{
			return 0;
		}
	}
	
	
	
}
