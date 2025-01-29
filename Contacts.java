import java.util.Scanner;

class Details
{
    String name;
    String nick;
    String ph;
    String mail;
    Details(String name,String nick,String ph,String mail)
    {
        this.mail=mail;
        this.nick=nick;
        this.name=name;
        this.ph=ph;
    }
    @Override
    public String toString()
    {
      return "Name:"+name+ "Nickname:"+nick+"Phone:"+ph+"mail:"+mail;
    
    
    }
}
 class Contacts
{
    private static Details[] dt=new Details[100];
    private static int count=0;
    public static Scanner s=new Scanner(System.in);

    public static void main(String args[])
    {
        while(true){
            System.out.println("\t\t CONTACTS");
            System.out.println("1.Add new contact"+"\n"+"2.Show all contacts"+"\n"+"3.Edit contact"+"\n"+"4.Delete contact"+"\n"+"5.Exit");
            int ch =s.nextInt();
            s.nextLine();
            
            if(ch==1)
            {
                Add();
            }
            else if(ch==2)
            {
                View();
            }
            else if(ch==3)
            {
                Edit();
            }
            else if(ch==4)
            {
                Delet();
            }
            else if(ch==5)
            {
                break;
            }
            else
            {
                System.out.println("Invalid entry");
            }
        }


    }

    private static void Add()
    {
        if(count<100)
        {
            System.out.println("Enter Name Nickname Phonenumber mail");
            String n=s.nextLine();
            String nn=s.nextLine();
            String ph=s.nextLine();
            String mail=s.nextLine();
            dt[count++]=new Details(n,nn,ph,mail);
            System.out.println("Contact added");
        }
        else
        {
            System.out.println("Contacts full");
        }

    }

    private static void View()
    {
        if(count==0)
        {
            System.out.println("No contact found");

        }
        else
        {
            for(int i=0;i<count;i++)
            {
                System.out.println((i+1)+"."+dt[i]);
            }
        }
    }

    private static void Edit()
    {
        System.out.println("Enter the contact index");
        int in=s.nextInt();
        s.nextLine();

        if(in>0 && in<count+1)
        {
            System.out.println("Enter Name Nickname Phonenumber mail");
            String n=s.nextLine();
            String nn=s.nextLine();
            String ph=s.nextLine();
            String mal=s.nextLine();
            dt[in-1]=new Details(n,nn,ph,mal);
            System.out.println("Contact updated");

        }
        else
        {
            System.out.println("Enter valid index");

        }
    }

    private static void Delet()
    {
        if (count!=0) 
        {
            System.out.println("Enter the index to be deleted:");
            int in=s.nextInt();
            if (in>0 && in<=count)
            {
                for (int i=in-1;i<count-1;i++)
                {
                    dt[i] = dt[i + 1];
                }
                dt[count - 1] = null;
                count--;
                System.out.println("Deleted successfully");
            } 
            else 
            {
                System.out.println("Invalid index entry");
            }
        } 
        else 
        {
            System.out.println("No contacts to delete");
        }

    }
}
