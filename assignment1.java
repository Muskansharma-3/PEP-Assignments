import java.util.*;

public class assignment1{

    public static int naiveSum(List<Integer> list){
        int sum=0;
        for(int num:list){
            sum+=num;
        }
        return sum;
    }

    // Time complexity -> O(n)
    // Space Complexity -> O(1)

    public static int recursiveSum(List<Integer> list){
        if(list.isEmpty()){
            return 0;
        }
        return list.get(0)+recursiveSum(list.subList(1, list.size()));
    }

    // Time complexity -> O(n)
    // Space Complexity -> O(n)

    public static int builtInSum(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    // Time complexity -> O(n)
    // Space Complexity -> O(1)
    public static void main(String[] args) {
        List<Integer> testList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Naive Sum: " + naiveSum(testList));

        System.out.println("Recursive Sum: " + recursiveSum(testList));

        System.out.println("Built-in Sum: " + builtInSum(testList));
    }
}