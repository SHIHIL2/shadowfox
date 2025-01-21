import java.util.Scanner;
import java.lang.Math;

public class ConsoleCalculator
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Options:");
        System.out.println("1.Arithmetic operations"+"\n"+"2.Scientific operations"+"\n"+"3.Conversions");
        int option =s.nextInt();
        switch(option)
        {
            case 1:
                ArithmeticOperations();
                break;
            case 2:
                ScientificOperations();
                break;
            case 3:
                Convertor();
                break;
            default:
                System.out.println("Invalid option");

        }
        System.out.println("Thankyou for using the calculator");

    }




    public static void ArithmeticOperations()
    {
        Scanner s=new Scanner(System.in);
        int fn,sn,sl;
        
        System.out.println("1.Addition" + "\n" + "2.Subtraction"+"\n"+"3.Multiplication"+"\n"+"4.Division");
        int a=s.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("Enter Two Numbers:");
                fn=s.nextInt();
                sn=s.nextInt();
                sl=fn+sn;
                System.out.println("Sum=  " + sl);
                break;
            case 2:
                System.out.println("Enter FIrst number and then Second number");
                fn=s.nextInt();
                sn=s.nextInt();
                sl=fn-sn;
                System.out.println("Difference= "+ sl);
                break;
            case 3:
                System.out.println("Enter FIrst number and then Second number");
                fn=s.nextInt();
                sn=s.nextInt();
                sl=fn*sn;
                System.out.println("Product= "+ sl);
                break;
            case 4:
                System.out.println("Enter FIrst number and then Second number");
                fn=s.nextInt();
                sn=s.nextInt();
                sl=fn/sn;
                System.out.println("Quotient= "+ sl);
                break;
            default:
                System.err.println("INVALID ENTRY");
                break;



        }
        System.out.println("Do you want to perform Arithmetic operation again");
        System.out.println("Type 1 for yes and 2 for no");
        int ch=s.nextInt();
        if(ch==1){
            ArithmeticOperations();
        }
        

    }

    public static void ScientificOperations()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Choose yor operation:");
        System.out.println("!.Exponent"+"\n"+"2.Square root"+"\n"+"3.Cube root"+"\n"+"4.Log calculations");
        int s2=s.nextInt();
        switch (s2) {
            case 1:
                System.out.println("Enter base and power:");
                double base=s.nextDouble();
                double power=s.nextDouble();
                double val=Math.pow(base, power);
                System.out.println("Value=" + val);   
                break;
            case 2:
                System.out.println("Enter the base:");
                double base1=s.nextDouble();
                double val1=Math.sqrt(base1);
                System.out.println("Value:"+val1);
                break;
            case 3:
                System.out.println("Enter the base:");
                double base2=s.nextDouble();
                double val2=Math.cbrt(base2);
                System.out.println("Value:"+val2);
                break;
            case 4:
                System.out.println("Enter the value:");
                double base3=s.nextDouble();
                double val3=Math.log(base3);
                System.out.println("Value="+val3);
                break;
                
            default:
                throw new AssertionError();
        }
        System.out.println("Do you want to perform Scientific operation again");
        System.out.println("Type 1 for yes and 2 for no");
        int ch=s.nextInt();
        if(ch==1){
            ScientificOperations();
        }

    }

    public static void Convertor()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1.Currency conversion"+"\n"+"2.Temperature conversion");
        int choice=s.nextInt();
        if(choice==1)
        {
            System.out.println("1.inr to usd"+"\n"+"2.usd to inr"+"\n"+"3.inr to euro"+"\n"+"4.euro to inr");
            int choice2=s.nextInt();
            switch (choice2) 
            {
                case 1:
                    System.out.println("Enter amount in inr:");
                    double inr=s.nextDouble();
                    double val=inr*0.012;
                    System.out.println("The amount in usd:"+ val);
                    
                    break;
                case 2:
                    System.out.println("Enter amount in usd:");
                    double usd=s.nextDouble();
                    double val1=usd*86.60;
                    System.out.println("The amount in inr:"+ val1);
                    break;
                case 3:
                    System.out.println("Enter amount in inr:");
                    double inr1=s.nextDouble();
                    double val2=inr1*0.011;
                    System.out.println("The amount in euro:"+ val2);
                    break;
                case 4:
                    System.out.println("Enter amount in euro:");
                    double euro=s.nextDouble();
                    double val3=euro*89.70;
                    System.out.println("The amount in inr:"+ val3);
                    break;
                

                default:
                    throw new AssertionError();
            }
        }
        else if(choice==2)
        {
            System.out.println("1.celsius to fahrenheit"+"\n"+"2.fahrenheit to celsius"+"\n"+"3.celsius to kelvin"+"\n"+"4.kelvin to celsius"+"\n"+"5.kelvin to fahrenheit"+"\n"+"6.fahrenheit to kelvin");
            int choice3=s.nextInt();
            switch (choice3) {
                case 1:
                    System.out.println("Enter temperature in celsius:");
                    double c=s.nextDouble();
                    double val4=(c*1.8)+32;
                    System.out.println("Temperature in fahrenheit:"+val4);
                    break;
                case 2:
                    System.out.println("Enter temperature in fahrenheit:");
                    double f=s.nextDouble();
                    double val5=(f-32)/1.8;
                    System.out.println("Temperature in celsius:"+val5);
                    break;
                case 3:
                    System.out.println("Enter temperature in celsius:");
                    double c1=s.nextDouble();
                    double val6=c1+273.15;
                    System.out.println("Temperature in kelvin:"+val6);
                    break;
                case 4:
                    System.out.println("Enter temperature in kelvin:");
                    double k=s.nextDouble();
                    double val7=k-273.15;
                    System.out.println("Temperature in celsius:"+val7);
                    break;
                case 5:
                    System.out.println("Enter temperature in kelvin:");
                    double k1=s.nextDouble();
                    double val8=((k1-273.15)*1.8)+32;
                    System.out.println("Temperature in fahrenheit:"+val8);
                    break;
                case 6:
                    System.out.println("Enter temperature in fahrenheit:");
                    double f1=s.nextDouble();
                    double val9=((f1-32)/1.8)+273.15;
                    System.out.println("Temperature in kelvin :"+val9);
                    break;

                default:
                    throw new AssertionError();
            }


        }
        System.out.println("Do you want to perform Conversion operation again");
        System.out.println("Type 1 for yes and 2 for no");
        int ch=s.nextInt();
        if(ch==1){
            Convertor();
        }
    }


}