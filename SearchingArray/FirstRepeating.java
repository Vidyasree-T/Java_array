public class FirstRepeating {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 1, 4, 4, 5};
        int n = arr.length;

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                if(arr[i] == arr[j]) {
                    System.out.println("First repeating element: " + arr[i]);
                    return;
                }
            }
        }

        System.out.println("No repeating element found");
    }
    }