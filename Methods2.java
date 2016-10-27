/*
Nate Elliott
Proffesor Kamp
10/25/16
Assignment Methods2

stringReverse - takes a string as a parameter and returns that string in reverse (backwards).
addEmUp - takes three integer parameters, a starting number, ending number and an increment value.
The method will return the sum between these numbers (inclusive) by increment.
loopNums -Write a method that takes two integers as parameters.  
Your method will use a while loop to print all numbers between the numbers (inclusive).  
You method should handle whether either parameter is lowest.
*/

public class Methods2{
   public static String stringReverse(String string1){
    String result = "";
    for (int i=string1.length()-1; i>=0; i--) {
        result += string1.charAt(i);
   }
   return result;
   }
   
   public static int addEmUp(int startnum, int endnum, int incnum){
   int sum = 0;
   while(startnum <= endnum){
   sum += startnum;
   startnum++;
   
   
   }
   
   return sum + incnum;
   }
   
   public static void loopNums(int num1, int num2){
   
   int smallnum = 0;
   int bignum = 0;
   if(num1 < num2){
      smallnum = num1;
      bignum = num2;
   }else{
      smallnum = num2;
      bignum = num1;
   }
   do{
      System.out.println(smallnum);
      smallnum++;
   
   }while(smallnum <= bignum);   
   }
   
   public static void main(String[] args){
   System.out.println(stringReverse("Nate"));
   System.out.println(addEmUp(0,5,100));
   loopNums(0,5);
   
   }


}