package com.company;

public class Console {
    public static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();     
    }
    
    public static void rush(String rushText){
        for (int i = 0; i < 100; i++) {
            System.out.println(rushText);
        }
    }
}
