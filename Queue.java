package random;

public class Queue  
{  
	 private static final int array = 3;  
	 int arr[] = new int[array];  
	 int size = 0;  
	 int top = -1;  
	 int rear = 0;  
	  
	 public void push(int pushedItem)
	 {  
	  if (top < array - 1)
	  {  
	   top++;  
	   arr[top] = pushedItem;  
	   System.out.println("Item " + pushedItem  
	     + " is pushed to Queue !");  
	   display();  
	  } 
	  else 
	  {  
	   System.out.println("Overflow !");  
	  }  
	  
	 }  
	  
	 public void pop()
	 {  
	  if (top >= rear) 
	  {  
	   rear++;  
	   System.out.println("Pop operation done !");  
	   display();  
	  } 
	  else 
	  {  
	   System.out.println("Underflow !");  
	  }  
	 }  
	  
	 public void display() 
	 {  
	  if (top >= rear) 
	  {  
	   System.out.println("Items in Queue : ");  
	   for (int i = rear; i <= top; i++) 
	   {  
	    System.out.println(arr[i]);  
	   }  
	  }  
	 }  
	  
	 public static void main(String[] args) 
	 {  
		 Queue queue = new Queue(); 
		 queue.pop();
		 queue.push(36);  
		 queue.push(14);  
		 queue.push(98);  
		 queue.push(47);  
		 queue.pop();  
		 queue.pop();  
	  	 queue.pop();  
	  	 queue.pop();  
	 }  
}
	  

	