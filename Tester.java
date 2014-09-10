import java.util.Scanner;


public class Tester{
  
  public static void main(String[] args){
   
  int count;  
  int factorial; 
  int number ; 
  String entry;

Scanner input  = new Scanner(System.in);

 entry = input.next();
 
 if(entry.charAt(0)=='t' && entry.charAt(1)=='a' &&entry.charAt(2)=='b' && entry.charAt(3)=='l' && entry.charAt(4)=='e'){
 number = input.nextInt();
 
 for(int i = 0 ; i < 13 ; i++){
 System.out.println(i*number);
 }
 }
 
 else if(entry.charAt(0)=='f' && entry.charAt(1)=='a'&& entry.charAt(2)=='c' && entry.charAt(3)=='t'){
 number = input.nextInt();
if (number < 0){
      System.out.println("I cannot compute the factorial of " + number);
    }
    else {
      factorial = 1;
      count = 1;
      
       while (count <= number){
        factorial = factorial*count;
        count++;
     }
  System.out.println(factorial);
 }
}
 
 else if(entry.charAt(0)=='m' && entry.charAt(1)=='a'&& entry.charAt(2)=='x'){
 
   
 }
 
}
}

