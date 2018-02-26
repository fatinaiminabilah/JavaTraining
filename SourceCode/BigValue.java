class BigValue {
     public static void main(String args[]) {
    
      BigValue d1 = new BigValue();
      BigValue d2 = new BigValue();
      System.out.println(d1 == d2);

      String s1 = "Malaysia";
      System.out.println(s1 + "is a country.");
      System.out.println(s1);
  
      String x1 = "Japan";
      String x2 = "Japan";
      System.out.println(x1 == x2);

      String x3 = new String ("Japan");
      System.out.println(x1 == x3) ;

      System.out.println(x1.equals (x2));
      System.out.println(x3.equals (x1));
      
      
    }
}

class Value {
     public static void main(String args[]) {

      int x = 5;
      int y = 15;

      System.out.println(x == y);
      x = y;
      System.out.println(x == y);

      
    }
  
}   