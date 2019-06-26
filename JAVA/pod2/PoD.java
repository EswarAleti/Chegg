import java.util.Scanner;
public class PoD
{
    public static void main( String [] args )
    {
        Scanner in = new Scanner( System.in );
        Stack computerTasks = new Stack();
        boolean quitProgram = false;
        while (!quitProgram)
        {
            String task = in.nextLine();
            if (task.equals("quit"))
            {
                quitProgram = true;
                //System.out.println("QUIT");
            }
            else
            {
                if (task.equals("undo"))
                {
                    String undoTask = computerTasks.pop();
                    //System.out.println("UNDO: "+undoTask);
                }
                else
                {
                    computerTasks.push(task);
                    //System.out.println("DO: "+task);
                }
            }
        }

System.out.println("************OUTPUT*************");
        System.out.println(computerTasks);
        in.close();
        System.out.print("END OF OUTPUT");
    }
}