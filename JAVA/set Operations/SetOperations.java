import java.util.Scanner;
import java.util.Arrays;
class SetOperations
{
   public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       int[] arrayA=new int[20];
       int[] arrayB=new int[20];
       int indexA=0,indexB=0;
       /*input for array A*/
       System.out.print("Enter elements of Array A: ");
       //take 20 unique elements atmose
       while(indexA<20)
       {
           //user input
           int element = input.nextInt();
           //if element less than 0 then break becasue it is the end of the array
           if(element<0)
               break;
           //found decides whether the element already exist in array before or not
           int found=0;
           //check previous element in array
           for(int j=indexA-1;j>=0;j--)
           {
               //if element found then make found as 1 and break
               if(arrayA[j]==element)
               {
                   found=1;
                   break;
               }
           }
           //if element not found then insert into arrayA and increment index
           if(found==0)
               arrayA[indexA++]=element;
       }
       /*input for array B*/
       //same as above
       System.out.print("Enter elements of Array B: ");
       while(indexB<20)
       {
           int element = input.nextInt();
           if(element<0)
               break;
           int found=0;
           for(int j=indexB-1;j>=0;j--)
           {
               if(arrayB[j]==element)
               {
                   found=1;
                   break;
               }
           }
           if(found==0)
               arrayB[indexB++]=element;
       }
       /*Array sorting using sort() in array class*/
       Arrays.sort(arrayA,0,indexA);
       Arrays.sort(arrayB,0,indexB);
       /*printing setA and setB*/
       System.out.println("Elements in setA: ");      
       for (int i=0;i<indexA;i++)
       {
           System.out.print(arrayA[i]+" ");
       }
       System.out.println("\nElements in setB: ");
       for (int i=0;i<indexB;i++)
       {
           System.out.print(arrayB[i]+" ");
       }
       /*intersection and deifference function calling*/  
       System.out.print("\nA Intersection B is :");
       intersection(arrayA,indexA,arrayB,indexB);
       System.out.print("\nA-B is :");
       difference(arrayA,indexA,arrayB,indexB);
       System.out.print("\nB-A is :");
       difference(arrayB,indexB,arrayA,indexA);  
   }
   public static void intersection(int setA[],int sizeA,int setB[],int sizeB)
   {
       //chaeck for every element of array A
       for(int i=0;i<sizeA;i++)
       {
           //found is used to find whether the element of array A exist in array B or not
           int found=0;
           for (int j=0;j<sizeB;j++)
           {
               //if same element found in array B then make found as 1 and break
               if(setA[i]==setB[j])
               {
                   found=1;
                   break;
               }  
           }
           //found = 1 means there is common element which is intersection
           if(found==1)
               System.out.print(setA[i]+" ");
       }
   }
   public static void difference(int setA[],int sizeA,int setB[],int sizeB)
   {
       //same as itersection but we print when found=0
       for(int i=0;i<sizeA;i++)
       {
           int found=0;
           for (int j=0;j<sizeB;j++)
           {
               if(setA[i]==setB[j])
               {
                   found=1;
                   break;
               }  
           }
           //found=0 means arrayA[i] not exist in array B so print it
           if(found==0)
               System.out.print(setA[i]+" ");
       }
   }
}