import java.util.*;
public class atm
{
    public static int bal=1000;
    public static String arr[]=new String[10];
    public static int c=0;

    public static void main(String args[])
    {
        System.out.println("HELLO USER! Welcome to our ATM Service.");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User name-");
        String user_name=sc.nextLine();
        System.out.println("Enter your PIN-");
        String user_pin=sc.nextLine();
        System.out.println("Successfully logged in !");
        while (true)
        {
        System.out.println();
        System.out.println("Services");
        System.out.println("1.Transactions History");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer");
        System.out.println("5. Log Out");
        System.out.println("Enter your choice=");
        int ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
            Transaction_History obj1=new Transaction_History();
            obj1.balance();
            break;
            case 2:
            Deposit obj2=new Deposit();
            obj2.dep();
            break;
            case 3:
            Withdraw obj3=new Withdraw();
            obj3.withd();
            break;
            case 4:
            Transfer obj4=new Transfer();
            obj4.transf();
            break;
            case 5:
            System.exit(0);
            default:
            System.out.println("Kindly enter a valid service!");
            break;
        }
    }
    }
}
class Transaction_History
{
    void balance()
    {
        if (atm.c==0)
        {
            System.out.println("You have not made any Transactions yet.");
        }
        else
        {
            for(int i=0;i<10;i++)
            {
                if (atm.arr[i]!=null){
                System.out.println(atm.arr[i]);}
            }
        }
    }      
}
class Deposit
{
    void dep()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the amount to be deposited = ");
            int amt=sc.nextInt();
            atm.bal= atm.bal+amt;
        
            String str=Integer.toString(amt);
            String s1="+"+str+" Deposited";
            atm.arr[atm.c]=s1;
            atm.c++;

        }
}
class  Withdraw
{
    void withd()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn = ");
        int amt=sc.nextInt();
        if(amt>atm.bal)
        {
            System.out.println("Insufficient Balance!");
        }
        else{
            atm.bal=atm.bal -amt;

            String str=Integer.toString(amt);
            String s1="-"+str+" Withdrawn";
            atm.arr[atm.c]=s1;
            atm.c++;
        }
    }
}
class Transfer
{
    void transf()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the recipient account number-");
        int acc=sc.nextInt();
        System.out.println("Enter the amount -");
        int amt2=sc.nextInt();
        if(amt2>atm.bal)
        {
            System.out.println("Insufficient Balance!");
        }
        else{
            atm.bal=atm.bal -amt2;
            String str=Integer.toString(amt2);
            String s1="-"+str+" Transfered";
            atm.arr[atm.c]=s1;
            atm.c++;
        }
        System.out.println("TRANSFER SUCCESSFULL");
    }
}