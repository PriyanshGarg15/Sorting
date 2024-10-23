//o(n^2)
package lecture_8;

public class a_bubble_sort_monuQ1 {
    public static void main(String[] args) {
        int[] arr={5,24,3,4,1};
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr) {
        for(int turn=1;turn<arr.length;turn++)
        {
            for(int i=0;i<arr.length-turn;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i]; 
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                for(int k=0;k<arr.length;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
