import java.math.BigInteger;

public class FindZerosTrail {
    public static int zeros(int n) {
        BigInteger fact=BigInteger.ONE;
        int count=0;
        if(n==0){
            fact=BigInteger.ZERO;
            System.out.println(fact);
        }else{
        do{
        fact=fact.multiply(BigInteger.valueOf(n));
        n--;
        }while(n>0);

        String fact_num=String.valueOf(fact);

        for (int i =fact_num.length()-1;i>=0 ; i--) {


            if(String.valueOf(fact_num.charAt(i)).equals("0")){
                count++;
            }else{
                break;
            }

        }}
        return count;
    }
    public static void main(String[] args) {
        System.out.println(zeros(14));
    }
}
