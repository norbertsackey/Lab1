import java.util.Scanner;
//@Norbert Sackey CS2016

// this is a sort of multi-purpose class which does a number of operations depending on parameters given it 
public class Tester{
  
  //the main 
  public static void main(String[] args){
   
  int count;  
  int factorial; 
  int number ; 
  String entry;

Scanner input  = new Scanner(System.in);

 entry = input.next();
 
 //if the parameter is table followed by a number  "n"
 if(entry.charAt(0)=='t' && entry.charAt(1)=='a' &&entry.charAt(2)=='b' && entry.charAt(3)=='l' && entry.charAt(4)=='e'){
 number = input.nextInt();
 
 for(int i = 0 ; i < 13 ; i++){
 System.out.println(i*number);
 }
 }
 
 // if the parameter is fact followed by a number "n"
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

