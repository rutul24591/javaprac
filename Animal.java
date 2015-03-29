package random;

 class Animal 
	{
	 public void move()
	  {
		System.out.println(" Animal can move");
	  }
	}
class Dog extends Animal
	{
	public void move()
	 {
	System.out.println(" Dogs can move");
	 }
	public void bark()
	   {
		System.out.println("Dogs can bark");
	   }
	}


class Test
    {   
	public static void main(String args[])
	   {
	      Animal a = new Animal(); // Animal reference and object
	      Animal b = new Dog(); // Animal reference but Dog object

	      a.move();// runs the method in Animal class
	      b.move();//Runs the method in Dog class
	     
	   }
	}
