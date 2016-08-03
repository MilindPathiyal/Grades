//Milind Pathiyal

//User enters a letter grade and code calculates whether he/she can participate in extracurricular activities
import java.util.*;
public class grades
{
    public void calculate()
    {
        Scanner input = new Scanner(System.in);
        double classes = 0;
        double sum = 0;
        char terminate1 = 'X';
        char terminate2 = 'x';
        double gradeF = 0.0;
        System.out.println("Enter X to finish");

         while( classes <= Integer.MAX_VALUE)
         {
            System.out.println("Enter Grade");
            
            String line = input.nextLine();
            char grade = line.charAt(0);
            double total = 0;
            if ('a' == grade || grade == 'A')
            {
                 total = 4.0;
            }
             
            else if ('b' == grade || grade == 'B')
            {
                total = 3.0;
            }
                    else if ('c' == grade || grade == 'C')
            {
                total = 2.0;
            }
                    else if ('d' == grade || grade == 'D')
            {
                total = 1.0;
            }
                    else if ('f' == grade || grade == 'F')
            {
                total = 0.0;
                gradeF = total + 1;
            }
            
            if ( 'x' == grade || grade == 'X' )
            {
                break;
            }
            classes++;
            sum = sum + total;
        }
        
        double gpa = sum / classes;
      
        if ( classes >= 4 && gpa > 2.0)
        {
            System.out.println("Eligible");
        }
        else if (gpa < 2.0)
        {
            System.out.println("Ineligible, gpa is below 2.0");
        }
        else if (gpa >= 2.0 )
        {
            if (gradeF == 1)
            {  
               System.out.println("Ineligible, gpa above 2.0 but has F grade");
            }
        }
        else if (gpa <= 2.0)
        {
            System.out.println("Ineligible, gpa is below 2.0 and has F gade");
        }

        System.out.println("Your GPA is " + gpa);
      
      
    }
}
/*
Enter X to finish
Enter Grade
a
Enter Grade
b
Enter Grade
c
Enter Grade
d
Enter Grade
x
Eligible
Your GPA is 2.5
 */