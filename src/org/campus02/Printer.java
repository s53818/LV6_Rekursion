package org.campus02;

public class Printer
{
    public static void main(String[] args)
    {
        //printFromNToZero(5);
        //printFromNToZeroRecursive(5);
        printFromZeroToNRecursive(5);
    }

    public static void printFromNToZero(int n)
    {
        while (n>=0)
        {
            System.out.println(n);
            n--;
        }
    }

    public static void printFromNToZeroRecursive(int n)
    {
        if(n < 0)
        {
            return;
        }
        System.out.println("n = " + n);
        printFromNToZeroRecursive(n - 1);
    }

    public static void printFromZeroToNRecursive(int n)
    {
        if(n < 0)
        {
            return;
        }
        printFromZeroToNRecursive(n -1);
        System.out.println("n = " + n);
    }

    public static void sum(int n)
    {
        if(n == 0)
        {
            return;
        }
        sum(n -1);

    }
}
