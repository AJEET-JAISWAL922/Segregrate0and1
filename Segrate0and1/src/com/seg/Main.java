package com.seg;

import java.io.*;
import java.util.*;
class Main {
    static void seg(int a[],int n)
    {
        int count = 0;
        for(int i = 0; i <n;i++)
        {
            if(a[i]==1)
            {
                count++;
            }
        }
    
        for( int i = 0; i < count; i++)
        {
            a[i]=1;
        }
        for(int i =count;i<n;i++)
        {
            a[i]=0;
        }
        
    }
    static void print(int a[],int n)
    {
        for(int i =0; i<n;i++)
        {
            System.out.print(a[i]+ " " );
        }
    }
    
    public static void main(String[] args) throws InterruptedException 
    {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[1000];
    int n = a.length;
    for(int i=0;i<n;i++)
    {
        a[i] = sc.nextInt();
    }
    seg(a,n);
    print(a,n);
    }
}