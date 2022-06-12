import java.util.HashMap;

class Twosum {



    public static int[] findSum(int[] arrNums, int target){

        HashMap<Integer,Integer> numsMap = new HashMap<>();

        for(int i=0;i<arrNums.length;i++) {

            Integer requiredNum =  (Integer)(target-arrNums[i]);

            if(numsMap.containsKey(requiredNum)){
                return new int[]{numsMap.get(requiredNum),i};
            }
                numsMap.put(arrNums[i],i);
        }
        return new int[]{-1 , -1};
    }

    public static void main(String[] args) {
        int[] testArr = {1,2,3,4,5};
        System.out.println(findSum(testArr,5)[0]+"=>"+findSum(testArr,5)[1]);
    }
}