public class Str{
  public static void main(String[] args){
//String Concatenation
String str1 = "Rock";
String str2 = "Star";
String str3 = str1.concat(str2);
System.out.println("concatenation of "+str1 + " and " + str2+"=" + (str3));
System.out.println("Length of " + str3+"=" + (str3.length()));
System.out.println("Index of S = " + (str3.indexOf('S')));
System.out.println("Character at position = " + (str3.charAt(6)));
System.out.println("Contains sequence 'tar': " + str3.contains("tar"));
System.out.println("EndsWith character 'r': " + (str3.endsWith("r")));
System.out.println("Replace 'Rock' with 'Duke': " + (str3.replace("Rock", "Duke")));
System.out.println("Convert to LowerCase: " + (str3.toLowerCase()));
System.out.println("Convert to UpperCase: " + (str3.toUpperCase()));
System.out.println("Compare To 'ROCKSTAR': " + str3.compareTo("rockstar"));
System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str3.compareToIgnoreCase("ROCKSTAR"));
}
}