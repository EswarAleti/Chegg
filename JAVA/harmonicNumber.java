import java.util.Scanner;

public class harmonicNumber {
  
public static double harmonicSum(int h){
  
if(h == 1){
  
return 1.0;
}
else{
  
return (1.0 / h) + harmonicSum(h - 1);
  
}
}
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
System.out.println(" Enter A Number ");
  
int n = scn.nextInt();
  
double hsum = harmonicSum(n);
  
System.out.println("\n Harmonic sum " + hsum);
}
  
}