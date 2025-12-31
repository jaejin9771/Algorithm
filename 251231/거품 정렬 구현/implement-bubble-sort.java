import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        boolean sorted = false;
        int temp;

        while (sorted == false) {
            sorted = true;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]) {
                    sorted = false;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;    
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}