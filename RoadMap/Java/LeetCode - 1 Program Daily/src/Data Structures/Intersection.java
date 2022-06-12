import java.util.*;
import java.util.stream.Collectors;

public class Intersection {
    public static void main(String []args){
        int []arr1 = {1,4,6,10,20,35};
        int []arr2 = {1,4,6,9,20};

        System.out.println("common element in two arrays are " +findCommaonElemnt(arr1,arr2));

    }
    public static List<Integer>findCommaonElemnt(int [] array1, int []array2){

        if((array1 ==null)||(array2==null)||(array1.length<=0)||(array2.length<=0)) //array is null or either one or both array is blank
            return null;

        Set<Integer> arraySet1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        Set<Integer> arraySet2 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        Set<Integer> commonElement = new LinkedHashSet<>();
        if(arraySet1.size() >= arraySet2.size()){
            for(int ii = 0;ii < arraySet1.size();ii++){
                if(arraySet2.contains(arraySet1.))
            }
        }

        return commonElement;

    }
}

