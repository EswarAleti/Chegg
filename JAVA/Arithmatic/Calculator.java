import java.util.*;
public class Calculator
{
   private int a,b;
   HashMap<String, Integer> Cal = new HashMap<>();
   Calculator()
   {
    
   }
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