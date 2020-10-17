import java.util.Map;
import java.util.TreeMap;

public class Order {
    public static String setOrder(String words) {
        String sentence="";
        String word="";
        String[] arr=words.split(" ");
        int num=0;
        Map<Integer,String> map=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            char[] ch=arr[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if(Character.isDigit(ch[j])){
                    num=Integer.parseInt(String.valueOf(ch[j]));
                    map.put(num, arr[i]);
                }
            }


        }
        for(Map.Entry<Integer,String> m:map.entrySet()){
            if(m.getKey()==map.size()){
                sentence+=m.getValue().concat("");
            }else{
                sentence+=m.getValue().concat(" ");
            }
        }

        return sentence;
    }

    public static void main(String[] args) {

        System.out.println(setOrder("thi2s me5 is4"));

    }
}
