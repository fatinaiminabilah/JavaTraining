class Ternary {
   
      public static void main (String args[]) {
     
      int x = 10;
      int y = 0;
      int z = 0;

      try {
      z = x/y;
      }

       catch(ArithmeticExeption e) {
         System.out.println ("Dividing by zero");
       }

    }
}