package Package_1;

import java.util.Scanner;

class BuzzFizz
{
public static void main(String arg[])
{
int no, i;
Scanner s=new Scanner(System.in);
System.out.println("Enter range of numbers");
no = s.nextInt();
for(i=1; i<=no; i++)
{
if((i % (3*5)) == 0)
{
System.out.println("FizzBuzz\n");
}
else if ((i % 5) == 0)
{
System.out.println("Buzz\n");
}
else if ((i % 3) == 0)
{
System.out.println("Fizz\n");
}
else
{
System.out.println(i);
}
}
}
}