package dev.himanshu.StriverSDE.Strings;

public class AllSubsequences2 {

    public static void main(String[] args) {
        printAllSubsequences("abc");
    }

    public static void printAllSubsequences(String s){
        subsequences(s,0, "");
    }

   private static void subsequences(String s, int index, String current){

        if(index >= s.length()){
            System.out.println(current);
            return;
        }

        subsequences(s, index+1, current+s.charAt(index));

        subsequences(s, index+1, current);

   }
}
