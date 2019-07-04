class Doctor {
 void Details() {
  System.out.println("Doctor Details...");
 }
}

class Surgeon extends Doctor {
 void Details() {
	super.Details();
  System.out.println("Surgen Detail...");
 }
}

public class Inheritance {
 public static void main(String args[]) {
  Surgeon s = new Surgeon();
  s.Details();
  
 }
}