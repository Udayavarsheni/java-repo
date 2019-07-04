public class Maths 
{ 
public static void main(String[] args) 
{
int a=10,b=-15;
double c=37.56,d=0.27;
System.out.println("Absolute value is '" + b + "' = " + Math.abs(b));
System.out.println("Round off '" + c + "' = " + Math.round(c));
System.out.println("Ceiling of '" + d + "' = " + Math.ceil(d));
System.out.println("Floor of '" + d + "' = " + Math.floor(d));
System.out.println("Minimum out of '" + a + "' and '" + b + "' = " + Math.min(a, b));
System.out.println("Maximum out of '" + a + "' and '" + b + "' = " + Math.max(a, b));

System.out.println("\nexp(" + c + ") = " + Math.exp(c));
System.out.println("log(" + d + ") = " + Math.log(d));
System.out.println("pow(5, 3) = " + Math.pow(5.0, 3.0));
System.out.println("sqrt(4) = " + Math.sqrt(4));

System.out.println("\nsin(30) = " + Math.sin(Math.toRadians(30)));
System.out.println("cos(30) = " + Math.cos(Math.toRadians(30)));
System.out.println("tan(30) = " + Math.tan(Math.toRadians(30)));
System.out.println("Theta = " + Math.atan2(4, 2));

}
} 

		