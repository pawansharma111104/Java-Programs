import java.util.*;

public class maxminarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        int min;
        int i;
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elemts of array");
        int arr[] = new int[n];

        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        min = arr[0];

        for (i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];

            }

        }
        System.out.println("max is " + max + " min is " + min);
        System.out.println("Enter the numb er you want to search");
        int s = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (s == arr[i]) {
                System.out.println("The index you want is " + i);
                break;
            }
            if (i == n - 1) {
                System.out.println("Wrong input");

            }
        }

    }

}
