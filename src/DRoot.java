public class DRoot {
    public static int digital_root(int n) {
        int sum=0,sum1=0;
        int sum2;
        int rem;
        int num=n;
        do{
            rem=num%10;
            sum+=rem;
            num/=10;
        }while(num>0);
        if(sum>9){
            do{
                int remainder=sum%10;

                sum1+=remainder;
                sum2=sum1;
                sum/=10;
            }while(sum>0);
        }else{
            sum2=sum;
        }
        return sum2;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(20));
    }
}
