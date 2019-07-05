class Cover{
      int  value1;
      int  value2;
      Cover(){
       value1 = 10;
       value2 = 20;
       System.out.println("Inside 1st Constructor:");
     }
     Cover(int a){
      value1 = a;
      System.out.println("Inside 2nd Constructor:");
    }
    Cover(int a,int b){
    value1 = a;
    value2 = b;
    System.out.println("Inside 3rd Constructor:");
   }
   public void display(){
      System.out.println("Value1 === "+value1);
      System.out.println("Value2 === "+value2);
  }
  public static void main(String args[]){
    Cover d1 = new Cover();
    d1.display();
    Cover d2 = new Cover(30);
    d2.display();
    Cover d3 = new Cover(30,40);
    d3.display();  
    
 }
}