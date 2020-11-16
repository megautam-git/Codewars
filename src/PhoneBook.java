public class PhoneBook {
    public static String createPhoneNumber(int[] numbers) {
        String s="";
        String s1="";
        for (int i = 0; i < numbers.length; i++) {
            s+=String.valueOf(numbers[i]);
            System.out.println(s);
        }
        s1+=s1.concat("("+s.substring(0,3)+")"+" "+s.substring(3,6)+"-"+s.substring(6));
        return s1;
    }
    public static void main(String[] args) {
        System.out.println(PhoneBook.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
    }
}

