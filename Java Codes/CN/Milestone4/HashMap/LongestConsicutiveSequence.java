package Milestone4.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LongestConsicutiveSequence {

    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {

        int n = arr.length;
        HashMap <Integer, Integer> map = new HashMap<>();
        ArrayList <Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int []dp = new int[n];
        int index = -1;

        for(int i = 0; i < n; i++){

            if(map.get(arr[i] - 1) != null){
                int last_index = map.get(arr[i] - 1) - 1;
                dp[i] = 1 + dp[last_index];
            }
            else{
                dp[i] = 1;
            }

            map.put(arr[i], i + 1);

            if(max < dp[i]){
                max = dp[i];
                index = i;
            }
        }


        result.add(arr[index] - max);
        result.add(arr[index] + 1);
        // for(int curr = arr[index] - max + 1; curr <= arr[index]; curr++){
        //     // System.out.print(curr + " ");
        //     result.add(curr);
        // }


        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = longestConsecutiveIncreasingSequence(arr);
        for(int i : result){
            System.out.println(i);
        }
        sc.close();
        return;
    }
}
