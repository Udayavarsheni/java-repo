import java.lang.NullPointerException;
class Array
{
public static void main(String[] args)
{

Account[] arr=new Account[2];
arr[0]=new Account();
arr[1]=new Account();
arr[0].setdata(5,6);
arr[1].setdata(3,2);

System.out.println("For First Array");
arr[0].show();
System.out.println("For Second Array");
arr[1].show();

}
}
class Account
{
int a,b;
public void setdata(int c,int d)
{
a=d;
b=c;
}
public void show()
{
System.out.println("value of a =" + a);
System.out.println("value of b =" +b);

}
}
