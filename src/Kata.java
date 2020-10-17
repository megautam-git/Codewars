public class Kata {
    public static boolean solution(String str, String ending) {
        boolean result=false;

        if(ending.length() <=str.length() && str.endsWith(ending)){
            result=true;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("Abd","bd"));
    }
}
