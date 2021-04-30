import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int []arr={8,6,4,5,11,6,4,3};
        int temp =0;
        for (int j = 0; j <arr.length ; j++) {
            for (int i =0;i<arr.length-1-j;i++){
                if (arr[i]>arr[i+1]){
                    temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        String s = Arrays.toString(arr);

        System.out.println(s);

    }
}