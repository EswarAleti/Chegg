	public class NoOfElemenentsLessThanX
{
   // return left child index of i
   public static int LEFT(int i)
   {
       return (2 * i + 1);
   }

   // return right child index of i
   public static int RIGHT(int i)
   {
       return (2 * i + 2);
   }

   //returns number of elements that are less than x
   public static int noOfElementsLessThanX(int[] Heap,int i, int x)
   {
       if(i<Heap.length && Heap[i]<x)
       {
           return 1+noOfElementsLessThanX(Heap, LEFT(i),x)+noOfElementsLessThanX(Heap, RIGHT(i),x);
       }
       return 0;
   }

   //return true if our condition is satisified false otherwise
   public static boolean isSatisified(int[] Heap,int x, int k)
   {
       if(noOfElementsLessThanX(Heap,0,x)>=k)
           return true   ;
       else
           return false;
   }

   //main method
   public static void main(String[] args)
   {
       int[] Heap={10,14,19,26,31,42,27,44,35,33};
       int x=34,k=6;
       System.out.println(isSatisified(Heap,x,k));
   }
}