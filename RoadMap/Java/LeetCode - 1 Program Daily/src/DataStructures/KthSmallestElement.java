import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class KthSmallestElement {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {7, 10, 4, 3, 20, 15}, k = 3 ;

        System.out.println("kth smallest element is  " + kthElement(arr, k));

    }
    public static int kthElement(int[] arr, int k) {

        Set<Integer>dataSet = new TreeSet<>(Arrays.stream(arr).boxed().collect(Collectors.toSet()));
        int jj =0;
        for(Integer ii:dataSet) {
            jj++;
            System.out.println(ii);
            if(jj==k)
                return ii;

        }
        return 0;
    }

}