package org.campus02.print;

public class Printer
{
    public static void main(String[] args)
    {
        printFromNToZero(5);
    }

    public static void printFromNToZero(int n)
    {
        while (n>=0)
        {
            System.out.println(n);
            n--;
        }
    }
}
