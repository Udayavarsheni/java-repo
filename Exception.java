import java.util.Scanner; 
class Exception{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception
   System.out.println("Enter a and b values:");
   Scanner i = new Scanner(System.in); 
	int a=i.nextInt();
	int b=i.nextInt();
                
          int data=a/b;
          System.out.println(data);
   }
   catch(ArithmeticException e)
   {
     System.out.println(e);
   }  
   finally
   { 
     System.out.println("rest of the code...");  
   }  
} 
} 
