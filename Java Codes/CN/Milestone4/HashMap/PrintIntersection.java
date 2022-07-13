package Milestone4.HashMap;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
public class PrintIntersection {


    // Code Solution using HashMap, Arrays
    public static void intersection(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < m; i++){
            int key1 = arr1[i];
            if(map.containsKey(key1)){
                map.put(key1, map.get(key1) + 1);
            }
            else{
                map.put(key1, 1);
            }
        }
        for(int i = 0; i < n; i++){
            int key2 = arr2[i];
            if(map.containsKey(key2) && map.get(key2) > 0){
                System.out.print(key2 + " ");
                map.put(key2, map.get(key2) - 1);
            }
        }
        return;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int []arr1 = new int[m];
        for(int i = 0; i < m; i++){
            arr1[i] = sc.nextInt();
        }
        
        int n = sc.nextInt();
        int []arr2 = new int[n];
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        intersection(arr1, arr2);
        sc.close();
        return;
    }
}
