import java.util.*;
import java.util.Scanner;
class grade
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {  

   int marks;
   
   /*This Is a Grade Checker Program*/
   while(true)
   {
   System.out.print("\n=========================================");
   System.out.print("\nluis try mo to");
   System.out.print("\n-----------------------------------");
   System.out.print("\nEnter The Marks Between 0 To 100:");
   System.out.print("\n=========================================\n");
   
   System.out.print("\nEnter The Mark: ");
   marks = sc.nextInt();
   
   if(marks>100)
   {
    /* Marks greater than 100 */
    System.out.print("\nDon't Be Smart Enter your Marks Between Limit\n");
   }
   else
   {
   switch(marks/10)
   {
       case 10 :
       case 9 :
           /* Marks between 90-100 */
           System.out.print("\n=============================");
           System.out.print("\nYour Grade Is: A or Excellent");
           System.out.print("\n=============================");
           break;
       case 8 :
       case 7 :
           /* Marks between 70-89 */
           System.out.print("\n=============================");
           System.out.print("\nYour Grade Is: B or Very Good" );
           System.out.print("\n=============================");
           break;
       case 6 :
           /* Marks between 60-69 */
           System.out.print("\n========================");
           System.out.print("\nYour Grade Is: C or Fair" );
           System.out.print("\n========================");
           break;
       case 5 :
       case 4 :
           /* Marks between 40-59 */
           System.out.print("\n========================");
           System.out.print("\nYour Grade Is: D or Pass");
           System.out.print("\n========================");
           break;
       default :
           /* Marks less than 40 */
           System.out.print("\n================================================");
           System.out.print("\nYou Grade Is: F or Fail\n");
           System.out.print("\nSuggetin: Do Not show your Sheet to Your Parent");
           System.out.print("\n================================================");
   }
 }
}   
   }
}
