package Milestone4.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class PairSumTo0 {

    public static int PairSum(int[] input, int size) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int zero = 0; // difine zero for get the nagative value
        int result = 0;

        for(int i = 0; i < size; i++){
            if(map.containsKey(zero - input[i])){
                result += map.get(zero - input[i]);
            }

            if(map.containsKey(input[i])){
                map.put(input[i], map.get(input[i]) + 1);
            }

            else{
                map.put(input[i], 1);
            }
        }
        
        return result;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []input = new int[n];

        for(int i = 0; i < n; i++){
            input[i] = sc.nextInt();
        }

        int result = PairSum(input, n);
        System.out.println(result);
        sc.close();
        return;
    }
}
