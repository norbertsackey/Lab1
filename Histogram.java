public class Histogram{

  public static int[ ] num = new int[ ]  {4,20,7,18,35,6,14,39,21,5};
  public static char symbol = '*' ;

  public static void main(String[] args){
  
    System.out.println("Y");
    for(int i = 0 ; i < num.length ; i++){
      System.out.print(" | ");
      for(int n= 0  ; n < num[i] ; n++){
      System.out.print(symbol);
      }
      System.out.println();
    }
  

   
  System.out.print(" ");
   int k = 1 ;
   while(k != 40){
   System.out.print("*");
   k++;
   }
  System.out.print("X");
  System.out.println();
  
  }
}