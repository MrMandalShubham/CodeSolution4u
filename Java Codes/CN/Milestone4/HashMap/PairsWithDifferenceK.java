package Milestone4.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class PairsWithDifferenceK {

    public static int getPairsWithDifferenceK(int arr[], int k) {
		
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for(int i = 0; i < arr.length; i++){
            int value = arr[i] + k;
            if(arr[i] >= k){
                value = arr[i] - k;
            }

            if(map.containsKey(value)){
                result += map.get(value);
            }
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        return result;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int result = getPairsWithDifferenceK(arr, k);
        System.out.println(result);
        sc.close();
        return;
    }
}