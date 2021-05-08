package leetcode.Solution;

import java.util.ArrayList;

/*
 *字符串全排列
 */
public class Solution12 {
    public static void main(String[] args) {
        def("123");
    }
    public static void def(String str){
        temp(str,new boolean[str.length()],new ArrayList<Character>());
    }
    public static void temp(String str, boolean[] booleans, ArrayList<Character> list){
        if (list.size() == str.length()){
            for (Character c:list){
                System.out.print(c);
            }
//            System.out.println(list.toString());
            System.out.print(" ");
        }
        for (int i = 0; i < str.length(); i++) {
            if (!booleans[i]){
                list.add(str.charAt(i));
                booleans[i] = true;
                temp(str,booleans,list);
                booleans[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}
