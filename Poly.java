class Calculation {
  public void calc() {
    System.out.println("calculator performs the list of operation");
  }
}

class Add extends Calculation {
  public void calc() {
	int a=3,b=3;

    System.out.println("the sum is:" + (a+b));
  
}
}
class Sub extends Calculation {
  public void calc() {
	int a=3,b=3;

    System.out.println("the sub is:" + (a-b));
  
}
}


class Poly {
  public static void main(String[] args) {
    Calculation cal = new Calculation();
    cal.calc();  
    Calculation ad = new Add();  
    ad.calc();
    Calculation sb = new Sub();  
    sb.calc();  
   
  }
}
