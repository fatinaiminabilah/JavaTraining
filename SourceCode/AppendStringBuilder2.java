
class AppendStringBuilder2 {
   public static void main (String args [])  {
          StringBuilder sb1 = new StringBuilder ();
          sb1.append ("Java");
          sb1.append (new Person ("Oracle"));
          System.out.println (sb1);
     }
   }
  
class Person {
      String name;
      Person (String str) { name = str; }
}System.out.println("Length of String Builder is : " + sb1.length())