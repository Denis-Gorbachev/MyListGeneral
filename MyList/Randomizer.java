package com.company;
import java.util.Collection;
import java.util.Random;
public class Randomizer 
{
    public static boolean randomInteger(Collection<Integer> collection, long number)
    {
        if (number < 0)
        {
            return false;
        }
        for (int i = 0; i < number; i++)
        {
            collection.add((int)(Math.random() * 100));
        }
        return true;
    }

    public static boolean randomDouble(Collection<Double> collection, long number)
    {
        if (number < 0)
        {
            return false;
        }
        for (int i = 0; i < number; i++)
        {
            collection.add((Math.random() * 100));
        }
        return true;
    }

    public static boolean randomString(Collection<String> collection, long number)
    {
        if (number < 0)
        {
            return false;
        }
        else
        {
            char[] chars = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
            String str = "";
            Random random = new Random(number);
            for (int i = 0; i < number; i++) 
            {
                char c = chars[random.nextInt(chars.length)];
                str += c;
                collection.add(str);
                str = "";
            }
        }
        return true;
    }
}