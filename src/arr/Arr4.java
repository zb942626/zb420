package arr;



public class Arr4 {
    public static void main(String[] args) {
        double[][] score = {{61,62,63,64,65},{71,72,73,74,75},{81,82,83,84,85}};
       double sum =0.0;
       double sum1=0.0;
       int all =0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {

                 sum += score[i][j];
                 sum1+=score[i][j];
                 all++;
            }
            System.out.println("第"+(i+1)+"班成绩是："+sum);
            sum =0;
        }
        double avg =sum1/all;
        System.out.println("三个班的总成绩是："+sum1);
        System.out.println("三个班的总成绩的平均值是："+avg);

    }
}
