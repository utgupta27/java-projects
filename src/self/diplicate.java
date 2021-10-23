package self;


import java.util.Scanner;
class ArrayFrequency
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];       // taking value of integer
        int count = 0;
        int k = 0;
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();    //elements of array
        }
        //step - 1
        int newarray[] = new int[n];
        for(int i=0; i<n; i++)
        {
            count = 0;
            for(int j=0; j<=i; j++)
            {
                if(array[i]==array[j])
                {
                    count++;
                }
            }
            if(count == 1)
            {
                newarray[k] = array[i];
                k++;
            }
        }
        //step 2;
        for(int i=0; i<k; i++)
        {
            count  = 0;
            for(int j=0; j<n; j++)
            {
                if(newarray[i] == array[j])
                {
                    count++;
                }
            }
            System.out.printf("%d occurs %d times\n",newarray[i],count);
        }
    }
}