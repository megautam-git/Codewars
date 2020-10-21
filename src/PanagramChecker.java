public class PanagramChecker {
    public boolean check(String sentence){
        boolean result=false;
        String s1=sentence.toLowerCase();
        for (char i = 'a'; i <='z' ; i++) {
            if(s1.length()>=26){
            if(s1.contains(String.valueOf(i))){
                result=true;
            }else {
                //System.out.println("not found");
                result=false;
                break;
            }
            }

        }


        return result;
    }

    public static void main(String[] args) {
     PanagramChecker panagramChecker=new PanagramChecker();
        System.out.println(panagramChecker.check("The quick brown fox jumps over the lazy dog.gg aardrf"));
    }
}
