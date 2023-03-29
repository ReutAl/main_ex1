import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please select the conversion base:");
        System.out.println("16 = Convert to Hexadecimal base, 10 = Convert to Decimal base");
        int base = scan.nextInt();
        boolean isExceed = false;
        if (base == 10)
        {
            System.out.println("Enter the requested number:");
            Scanner stringScanner = new Scanner(System.in);
            String requestedNumber = stringScanner.nextLine();
            int sum = 0;
            int pow = requestedNumber.length() - 1;
            for (int i = 0; i < requestedNumber.length(); i++)
            {
                if (requestedNumber.charAt(i) == '1')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += Math.pow(16, pow);
                    }
                }
                else if (requestedNumber.charAt(i) == '2')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 2 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == '3')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 3 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == '4')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 4 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == '5')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 5 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == '6')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 6 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == '7')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 7 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == '8')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 8 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == '9')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 9 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == 'A')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 10 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == 'B')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 11 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == 'C')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 12 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == 'D')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 13 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == 'E')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 14 * (Math.pow(16, pow));
                    }
                }
                else if (requestedNumber.charAt(i) == 'F')
                {
                    if (Math.pow(16, pow) > 2147483647)
                    {
                        System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                        isExceed = true;
                        break;
                    }
                    else
                    {
                        sum += 15 * (Math.pow(16, pow));
                    }
                }
                pow--;
            }
            if (isExceed == false)
            {
                System.out.println("The number in base 10 is " + sum);
            }
        }
        else if (base == 16)
        {
            System.out.println("Enter the requested number:");
            Scanner intScanner = new Scanner(System.in);
            int requestedNumber = intScanner.nextInt();
            if (requestedNumber > 2147483647)
            {
                System.out.println("The requested number to convert exceeds the upper range of an int variable (2,147,483,647), please select a new number");
                isExceed = true;
            }
            if (isExceed == false)
            {
                int prevResult = 0;
                int result = requestedNumber / 16;
                int remnant = requestedNumber - (result * 16);
                String num = null;
                String finalNum = String.valueOf(remnant);
                while (result != 0)
                {
                    prevResult = result;
                    result = prevResult / 16;
                    remnant = prevResult - (result * 16);
                    num = finalNum;
                    if (remnant == 10)
                    {
                        finalNum = 'A' + num;
                    }
                    else if (remnant == 11)
                    {
                        finalNum = 'B' + num;
                    }
                    else if (remnant == 12)
                    {
                        finalNum = 'C' + num;
                    }
                    else if (remnant == 13)
                    {
                        finalNum = 'D' + num;
                    }
                    else if (remnant == 14)
                    {
                        finalNum = 'E' + num;
                    }
                    else if (remnant == 15)
                    {
                        finalNum = 'F' + num;
                    }
                    else
                    {
                        finalNum = String.valueOf(remnant) + num;
                    }
                }
                System.out.println("The number in base 16 is " + finalNum);
            }
        }
        else
        {
            System.out.println("Error in base type, please close the program and try again");
        }
    }
}
