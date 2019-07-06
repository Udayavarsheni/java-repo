import java.util.*; 
public class Hash{
  public static void main(String[] args){
    // Create a HashMap object called map
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    // Add keys and values 
    map.put(1,"Java");  
    map.put(2, "Python");  
    map.put(3, "PHP");  
    map.put(4, "SQL");
    map.put(5, "C++");
    System.out.println("Elements of the Map:");
    System.out.println(map);
    System.out.println(map.get(5));//To access an item
    System.out.println(map.remove(3));//To remove an item
    System.out.println("After removing the elements of Map:");
    System.out.println(map);
    System.out.println(map.size());//To find the size of item    
    
  }
}