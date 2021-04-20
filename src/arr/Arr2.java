package arr;

public class Arr2 {
    public static void main(String[] args) {
        int [] arr ={82,63,99,85,60};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++)
            {
                if (arr[j]<arr[j+1]){
                    int temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.print("[");
        for (int p=0;p<arr.length;p++){
            if (p==arr.length-1){
                System.out.print(arr[p]);
            }else {
                System.out.print(arr[p]+",");
            }
        }
        System.out.println("]");
    }
}
