
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Cat extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The cat sounds: Meow Meow");
  }
}

class Abstract {
  public static void main(String[] args) {
    Cat c = new Cat(); // Create a Pig object
    c.animalSound();
    c.sleep();
  }
}
