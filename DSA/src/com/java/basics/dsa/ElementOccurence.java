package com.java.basics.dsa;
import java.util.Scanner;
import java.util.Scanner;

public class ElementOccurence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            int count = 0;

            for(int j = 0; j < n; j++)
            {
                if(a[i] == a[j])
                {
                    count++;
                }
            }

            int k;

            for(k = 0; k < i; k++)
            {
                if(a[i] == a[k])
                {
                    break;
                }
            }

            if(k == i)
            {
                System.out.println(a[i] + " occurs " + count + " times");
            }
        }
    }
}
