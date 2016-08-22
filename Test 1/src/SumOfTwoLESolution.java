
public class SumOfTwoLESolution {

		public static int SumOfTwoLargestElement(int[] a)
		{
		    int FirstL= Integer.MAX_VALUE;
		    int secondL = Integer.MIN_VALUE;
		    for (int i:a)
		    {
		        if (i > FirstL)
		        {
		            secondL = FirstL;
		            FirstL = i;
		        }
		        else if (i > secondL && i < FirstL)
		        {
		            secondL = i;
		        }
		    }
		    int c= FirstL + secondL;
		    return c ;
		   
		}

		public static void main(String []args)
		{
		    int [] values = new int[5];
		        values[0] = 5;
		        values[1] = 10;
		        values[2] = 15;
		        values[3] = 20;
		        values[4] = 25;
		    
		    System.out.println("Sum of two largest Element:"+SumOfTwoLargestElement(values));
		}  
		}
	
