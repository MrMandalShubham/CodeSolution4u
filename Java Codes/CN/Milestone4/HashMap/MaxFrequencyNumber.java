package Milestone4.HashMap;
import java.util.Scanner;
import java.util.HashMap;

public class MaxFrequencyNumber {

    // Code Solution using HashMap
    public static int maxFrequencyNumber(int[] arr){ 
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            
            if(map.containsKey(arr[i]) == false){
                map.put(arr[i], 1);
            }
            else{
            	map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        
        int result = 0;
        int rep = -1;
        
        for(int i = 0; i < arr.length; i++){

            int val = map.get(arr[i]);
            
            if(rep < val){
                rep = val;
                result = arr[i];
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

        int result = maxFrequencyNumber(arr);
        System.out.println(result);
        sc.close();
        return;
    }
}
