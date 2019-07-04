import java.util.ArrayList;
class List {
 public static void main(String[] args) {
  
  ArrayList arl = new ArrayList();
  //Size of arrayList
  System.out.println("Size of ArrayList at creation: " + arl.size());
  
  arl.add("D");
  arl.add("U");
  arl.add("K");
  arl.add("E");

  //Recheck the size after adding elements
  System.out.println("Size of ArrayList after adding elements: " + arl.size());

  //Display all contents of ArrayList
  System.out.println("List of all elements: " + arl);

  //Remove some elements from the list
  arl.remove("D");
  System.out.println("See contents after removing one element: " + arl);

  //Remove element by index
  arl.remove(2);
  System.out.println("See contents after removing element by index: " + arl);

  //Check size after removing elements
  System.out.println("Size of arrayList after removing elements: " + arl.size());
  System.out.println("List of all elements after removing elements: " + arl);

  //Check if the list contains "K"
  System.out.println(arl.contains("K"));

  //Modify the element at the index
  arl.set(1,"V");
  System.out.println(arl);
  //Retrieve the element from the index
  System.out.println(arl.get(0));

 }
}