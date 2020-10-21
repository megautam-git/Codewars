public class NumberZooPetrol {
    public static int findMissingNumber(int[] numbers) {
        int sum=0;
        int sum1=0;

        int range=numbers.length+1;

        for(int i=0;i<=range;i++){
            sum+=i;
        }
        for(int i=0;i<numbers.length;i++){
            sum1+=numbers[i];
        }
        return sum-sum1;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3};
        System.out.println(findMissingNumber(arr));
    }
}
