//o(n^2)
package lecture_8;
import java.util.Scanner;
public class e_insertion_sort_monu {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            int k = sc.nextInt();
            arr[i] = k;
        }
        for(int i=0;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
         for (int i = 0; i < n; i++) 
        {
            System.out.println(arr[i]+" ");
        }
       
    }
}


