//Example that illustrates use of methods
public class StaticMethod {
   //The entry point
   public static void main(String[] args){
      //declare two integer variables
      int firstNum = 87;
      int secondNum = 68;
      //invoking the method
      System.out.println("The result is " + calculateSum(firstNum,secondNum));
   }

   //creating the method.
   static int calculateSum(int first,int second){
      int sum =  first + second;
      return sum;
   }
}
