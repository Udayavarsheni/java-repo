class Doctor {
 void Doctor_details() {
  System.out.println("Doctor Details...");
 }
}

class Surgeon extends Doctor {
 void Surgeon_details() {
	
  System.out.println("Surgen Detail...");
 }
}

public class Inheritance {
 public static void main(String args[]) {
  Surgeon s = new Surgeon();
  s.Doctor_details();
  s.Surgeon_details();
  
 }
}