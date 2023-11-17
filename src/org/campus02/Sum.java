package org.campus02;

import java.util.ArrayList;
import java.util.Iterator;

public class Sum
{
    public static void main(String[] args)
    {
        //System.out.println(sumUpRecursive(3));
        //System.out.println(sumUpIterative(3));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //System.out.println(iterativeSum(list));
        System.out.println(recursiveSum(list));
    }

    public static int sumUpIterative(int n)
    {
        int sum = 0;
        while (n >= 0)
        {
            sum = sum + n;
            n--;
        }
        return sum;
    }

    public static int sumUpRecursive(int n)
    {
        if(n <= 0)
        {
            return 0;
        }
        return n + sumUpRecursive(n -1 );
    }

    public static int iterativeSum(ArrayList<Integer> list)
    {
        int sum = 0;
        for (Integer i : list)
        {
            sum = sum + i;
        }
        return sum;
    }

    public static int recursiveSum(ArrayList<Integer> list)
    {
        int sum = 0;
        if(list.isEmpty())
        {
            return 0;
        }
        sum = list.remove(0);
        return sum + recursiveSum(list);
    }
}
