
import java.util.Scanner;

public class LastOccurrence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key element: ");
        int key = sc.nextInt();

        int index = -1;

        for(int i = arr.length - 1; i >=0; i--){
            if(arr[i] == key){
                index = i;
                break;
            }
        }

        if(index != -1){
            System.out.println("Last occurrence of " + key + " is at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}