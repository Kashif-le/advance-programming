public class Assignment_2 {
    public static void main(String[] args) {
       
       

    
        Runnable runnable1=()->{
            int totalEven = 0;
            for (int j = 1; j <= 10000; j++) {
                if(j%2==0)
totalEven+=1;

              
            }
 System.out.println("Total Evens are : "+totalEven);

        };

        Runnable runnable2=()->{
            int totalPrime = 0;

int num;
            for (int i = 0; i <= 10000; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     totalPrime+=1;
	  }	
       }
System.out.println("There are total "+totalPrime+" Prime numbers from 1 to 1000");


        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }   
}
