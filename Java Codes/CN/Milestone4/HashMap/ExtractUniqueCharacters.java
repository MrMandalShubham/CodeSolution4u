package Milestone4.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ExtractUniqueCharacters {

    public static String uniqueChar(String str){

        String result = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                // map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                continue;
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }

        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i)) && map.get(str.charAt(i)) > 0){
                System.out.print(str.charAt(i));
                map.put(str.charAt(i), 0);
            }
            else{
                continue;
            }
        }

        return result;

	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = uniqueChar(str);
        System.out.println(result);
        sc.close();
    }
}
