public class FirstNonrepeating {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3,6};
        int n=arr.length;
        
         for(int i = 0; i < n; i++) {

            int count = 0;

            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count == 1) {
                System.out.println("First non-repeating element: " + arr[i]);
                return;
            }
        }

        System.out.println("No non-repeating element found");
    }
}
