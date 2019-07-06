import java.util.Scanner;
class User {
  public static void main(String[] args) {
    Scanner i = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter name,age,salary");
    String name = i.nextLine();  // Read user input
    int age= i.nextInt();
    double salary=i.nextDouble();
    System.out.println("Name: " + name);  
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
} 