
abstract class Telephone
{
 abstract void callme();
 public void normal()
 {
  System.out.println("This was a noiraml call");
 }  
}
class Mobile extends Telephone
{
 void callme()
 {
  System.out.println("callme"); 
 }
 public static void main(String[] args)
 {
  Mobile girl = new Mobile();
  girl.callme();
  girl.normal();
 }
}