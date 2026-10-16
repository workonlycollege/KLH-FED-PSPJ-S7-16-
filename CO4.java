import java.util.Scanner;
class CO4
{
    String name;
    String number;
    int hours;

    CO4(String name, String number, int hours)
    {
        this.name=name;
        this.number=number;
        this.hours=hours;
    }

    void display()
    {
        System.out.println("Customer: " +name);
        System.out.println("Vehicle Number: " +number);
        System.out.println("Hours: " +hours);
        System.out.println("Amount: $" +(hours*50));
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.print("Enter Name: ");
            String name=sc.next();
            System.out.print("Enter Vehicle Number: ");
            String number=sc.next();
            System.out.print("Enter Parking Hours: ");
            int hours=sc.nextInt();

            if(hours<=0) System.out.println("Invalid Hours");
            else
            {
                CO4 obj=new CO4(name,number,hours);
                obj.display();
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
        }
    }
}