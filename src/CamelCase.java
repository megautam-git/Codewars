public class CamelCase {
    public static String camelCase(String input) {
        String s="";
        String s1="";
        char[] arr=input.toCharArray();
        for (int i = 0; i <arr.length ; i++) {

          if(Character.isLowerCase(arr[i])) {
              s += arr[i];
          }
          else if(Character.isUpperCase(arr[i])){
              s1+=arr[i];
              s+=" "+s1;
              s1="";
          }

        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(camelCase("thisIsMe"));
    }
}
//\\p{Lu}