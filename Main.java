import java.util.Scanner;

class Marks 
{
    String name;
    int m1, m2, m3, max;
    float avg;

    Marks(String n, int a, int b, int c) 
    {
    name = n;
    m1 = a;
    m2 = b;
    m3 = c;
    }

    void calculate() 
    {
        avg = (m1 + m2 + m3) / 3.0f;

        if (m1 >= m2 && m1 >= m3)
        max = m1;
        else if (m2 >= m1 && m2 >= m3)
        max = m2;
        else
        max = m3;
    }

    void display()
    { 
        System.out.println("Name : " + name);
        System.out.println("Mark 1 : " + m1);
        System.out.println("Mark 2 : " + m2);
        System.out.println("Mark 3 : " + m3);
        System.out.println("Maximum Mark : " + max);
        System.out.println("Average Mark : " + avg);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String nm = in.nextLine();

        System.out.print("Enter Mark 1: ");
        int x = in.nextInt();

        System.out.print("Enter Mark 2: ");
        int y = in.nextInt();

        System.out.print("Enter Mark 3: ");
        int z = in.nextInt();

        Marks ms = new Marks(nm, x, y, z);

        ms.calculate();
        ms.display();
        }
}