package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(hasUniqueChars("Helol wrd!"));
    }

    public static boolean hasUniqueChars(String str) {
        for(int i = 0; i < str.length(); i++){
            for (int j = i+1 ; j< str.length();j++){
                if(str.substring(i,i+1).equals(str.substring(j,j+1))){
                    return true;
                }

            }
        }



    return false;}


}