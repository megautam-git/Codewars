import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOutlier {
    static int find(int[] integers){
        int result=0;
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i <integers.length ; i++) {
            if(integers[i]%2==0){
                list.add(integers[i]);
            }else{
                list1.add(integers[i]);
            }
        }
        if(list.size()==1){
            result=list.get(0);
        }else if(list1.size()==1){
            result=list1.get(0);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,5,2,9};
        System.out.println(find(arr));
    }
}
