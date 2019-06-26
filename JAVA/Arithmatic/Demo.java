import java.util.*;
class Calculator
{
   private int a,b;
   HashMap<String, Integer> Cal = new HashMap<>();
   public void setVariable(String varName,int a)
   {
       Cal.put(varName,a);
   }
   public void printAllVariables()
   {
       System.out.println("Value of A is: "+Cal.get("A"));
       System.out.println("Value of B is: "+Cal.get("B"));
   }
   public int getAddition()
   {
       return Cal.get("A")+Cal.get("B");
   }
   public int getSubtraction()
   {
       return Cal.get("A")-Cal.get("B");
   }
   public int getMultiplication()
   {
       return Cal.get("A")*Cal.get("B");
   }
   public float getDivision()
   {
       return Cal.get("A")/(float)Cal.get("B");
   }
   public int getModuloDivision()
   {
       return Cal.get("A")%Cal.get("B");
   }
}
public class Demo
{
   public static void main(String[] args)
   {
       Calculator cal = new Calculator();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter value of a: ");
       int a=sc.nextInt();
       System.out.print("Enter value of b: ");
       int b=sc.nextInt();
       cal.setVariable("A",a);
       cal.setVariable("B",b);
       System.out.println();
       cal.printAllVariables();
       System.out.println("Addition of "+a+" and "+b+" = "+cal.getAddition());
       System.out.println("Subtraction of "+a+" and "+b+" = "+cal.getSubtraction());
       System.out.println("Multiplication of "+a+" and "+b+" = "+cal.getMultiplication());
       System.out.println("Division of "+a+" and "+b+" = "+cal.getDivision());
       System.out.println("Modulo Division of "+a+" and "+b+" = "+cal.getModuloDivision());
   }
}