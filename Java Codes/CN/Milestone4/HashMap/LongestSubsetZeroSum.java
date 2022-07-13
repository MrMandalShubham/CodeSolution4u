package Milestone4.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubsetZeroSum {

    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		
        HashMap <Integer, Integer> map = new HashMap<>();
        int sum_nums = 0;
        int longest_len = 0;

        for(int i = 0; i < arr.length; i++){

            sum_nums += arr[i];

            if(arr[i] == 0 && longest_len == 0){
                longest_len = 1;
            }

            if(sum_nums == 0){
                longest_len = i + 1;
            }
            Integer map_len = map.get(sum_nums);

            if(map_len != null){
                longest_len = Math.max(i - map_len, longest_len);
            }
            else
                map.put(sum_nums, i);
        }
        return longest_len;
	}

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = lengthOfLongestSubsetWithZeroSum(arr);
        System.out.println(result);
        sc.close();
        return;
    }
}
