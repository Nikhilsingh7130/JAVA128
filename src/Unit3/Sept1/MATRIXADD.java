package Unit3.Sept1;
import java.util.Scanner;
public class MATRIXADD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SIZE OF ARRAY: ");
        int n = sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Array Elemnets for 2nd Array");
        int brr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                brr[i][j]=sc.nextInt();
            }
        }
        int crr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                crr[i][j]=brr[i][j]+arr[i][j];
            }
        }
        System.out.println("MATRIX");
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
