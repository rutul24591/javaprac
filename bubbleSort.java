package random;

public class bubbleSort {
	private static int[]a;
	public static void main(String args[]){
		a= getArray();
		printArray();
		sort();
		System.out.println();
		printArray();
	}
	
	public static void sort(){
		int left= 0;
		int right = a.length - 1;
		bubbleSort1(left,right);	
	}
	
	private static void bubbleSort1(int left,int right){
		for(int i=right;i>1;i--)
		{
			for(int j=left;j<j-i-1; j++){
				if(a[j] > a[j+1]){
					swap(j,j+1);
				}
			}
		}
	}
	
	public static void swap(int left, int right){
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
		
	}
	
	public static void printArray(){
		for(int i:a){
			System.out.println(i+"");
		}
	}
	
	
	public static int[] getArray(){
		int size= 10;
		int []array= new int[size];
		int item=0;
		for(int i=0; i<size;i++){
				item= (int) (Math.random()*100);
				array[i]= item;
		}
		return array;	
	}
}
