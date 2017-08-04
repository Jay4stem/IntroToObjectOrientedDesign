//Example that illustrates use of methods
public class Method {
   //The entry point
   public static void main(String[] args){
      //declare two integer variables
      int firstNum = 87;
      int secondNum = 68;
      //invoking the method
      FirstMethod callMethod = new FirstMethod();
      callMethod.calculateSum(firstNum,secondNum);
      System.out.println("The result is " + calculateSum(firstNum,secondNum));
   }

   //creating the method.
   instance int calculateSum(int first,int second){
      int sum =  first + second;
      return sum;
   }
}
