interface Demo1
{
  
   public void method1();
   
}
interface Demo2
{
  
   public void method2();   
}

class MInterfa implements Demo1,Demo2
{
   /* This class must have to implement both the abstract methods
    * else you will get compilation error
    */
   public void method1()
   {
	System.out.println("implementation of method1");
   }
   public void method2()
   {
	System.out.println("implementation of method2");
   }
   public static void main(String arg[])
   {
	MInterfa obj = new MInterfa();
	obj.method1();
        obj.method2();
   }
}