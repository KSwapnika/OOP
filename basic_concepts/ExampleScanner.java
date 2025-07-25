package basic_concepts;
//program to calculate the total and average of 3 subjects
import java.util.*;

public class ExampleScanner {

public static void main(String args[])
{
int m,p,c,total;
double avg;
Scanner x=new Scanner (System.in);
System.out.println("Enter 3 marks");
m=x.nextInt();
p=x.nextInt();
c=x.nextInt();
x.close();
total=m+p+c;
avg=(double)total/3;
System.out.println("Total is "+total);
System.out.println("Average is "+avg);
}
}