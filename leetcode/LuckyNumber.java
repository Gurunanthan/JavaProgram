package leetcode;
import java.util.*;
public class LuckyNumber {
    public static void findLuckyNumber(int arr[])
    {
        Map <Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int curr=arr[i];
            if(!map.containsKey(curr))
            {
                map.put(curr, 1);
            }
            else{
                int instance = map.get(curr);
                map.put(curr,instance+1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                System.out.println("Lucky number: " + entry.getKey());
            }
        }

    }
    public static void main(String args[])
    {
        int arr[] ={1,2,2,3};
        findLuckyNumber(arr);
    }
}
