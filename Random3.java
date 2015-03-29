package random;

class Random3 
{
	
	
		void test()
		{
			System.out.println("no parameters");
		}	
		void test(int a)
		{
			System.out.println("a:" +a);
		}
		void test(int a, int b)
		{
			System.out.println(" a and b:" +a+ ""+b);
		}
		double test(double a)
		{
			System.out.println("double a:" +a);
            return a*a;		
		}
	
	}		
	class Overload
	  {
		public static void main(String args[])
		{
			Random3 ab = new Random3();
			double result;
			ab.test();
			ab.test(20);
			ab.test(20,30);
			result= ab.test(565.65);
			System.out.println(" Result of ab.test(565.65):"+ result);
		}
	}
