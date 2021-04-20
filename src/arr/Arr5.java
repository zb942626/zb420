package arr;



public class Arr5 {
    public static void main(String[] args) {
        String[]arr={"梁润","海军" ,"心如","长鹤","赵波","李通","腾林"};
        //Random random = new Random();
        int a = (int) (Math.random() * 7);
        int b = (int) (Math.random() * 7);
        int c = (int) (Math.random() * 7);
        while (true) {
            if (a != b && a != c) {
                break;
            } else {
                a = (int) (Math.random() * 7);
            }
        }
        while (true) {
            if (b != a && b != c) {
                break;
            } else {
                b = (int) (Math.random() * 7);
            }
        }
        System.out.println(arr[a]);
        System.out.println(arr[b]);
        System.out.println(arr[c]);
       

    }
}
