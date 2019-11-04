package by.it._examples_.demo04;

// Demonstrate an if-else-if ladder.
class Ladder {    
  public static void main(String args[]) {    
  /*  int x;
  
    for(x=0; x<6; x++) {  
      if(x==1) 
        System.out.println("x is one");  
      else if(x==2)  
        System.out.println("x is two"); 
      else if(x==3)  
        System.out.println("x is three");  
      else if(x==4)  
        System.out.println("x is four");  
      else  */
      //  System.out.println("x is not between 1 and 4");

      int a = 1, b = 1;

      while (a <= 10 && b <= 10) {

          for (b = 1; b <= 10; b++) {
              System.out.println(a + " умножить на " + b + " равно " + a * b);
          }
          a++;
          b = 1;
    }  
  } 
}
