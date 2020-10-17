import java.util.Arrays;

public class DescendingOrder {

        public static int sortDesc(final int num) {
            int result=0;
            String num1=String.valueOf(num);
            String num2="";
            char[] arr=num1.toCharArray();
            Arrays.sort(arr);
            for (int i = arr.length-1; i >=0 ; i--) {
                System.out.println(arr[i]);
                num2+=arr[i];
            }
            result=Integer.parseInt(num2);
            return result;
        }

    public static int sortDesc1(final int num) {
        //Your code
        String reverse="";
        String n= Integer.toString(num);
        char[] arr=n.toCharArray();
        Arrays.sort(arr);


        for (int i = arr.length-1; i >=0; i--) {
            reverse+=arr[i];

        }
        int digit=Integer.valueOf(reverse);
        return digit;
    }
    public static void main(String[] args) {
        System.out.print(sortDesc(82471385));
    }
}
