package com.example;

public class next {
    public static void main(String[] args) {
        int count = 0;
        int MaxLen = 0;
        int [] myArray = {1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1}; 
        for (int num : myArray) {
            if (num == 1) {
                count++; 
                if (count > MaxLen) {
                    MaxLen = count;
                }
            } else {
                count = 0;

            }
        }    
        System.out.format("колличество единиц =  %d" , MaxLen);
    }
        
}




