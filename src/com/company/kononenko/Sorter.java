package com.company.kononenko;


import java.util.*;

public class Sorter {
    private String text;
    private Map<Character, Integer> groupPairedSymbols;
    private Map<Character, Integer> groupUnpairedSymbols;

    public Sorter() {
        text = "";
        groupPairedSymbols = new HashMap<>();
        groupUnpairedSymbols = new HashMap<>();
    }

    public void inputString(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in the text");
        text = in.next();
    }

    public void printText(){
        System.out.println(text.length() > 0 ? text : "No text entered");
    }

    public void sort(){
        text = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) % 2 == 0) {
                groupPairedSymbols.put(text.charAt(i),(int)text.charAt(i));
            } else {
                groupUnpairedSymbols.put(text.charAt(i),(int)text.charAt(i));
            }
            System.out.println((int)text.charAt(i));
        }
    }

    public void printGroups(){
        System.out.println("Group paired symbols");
        int sum = 0;
        for (Map.Entry symbol:groupPairedSymbols.entrySet()) {
            System.out.printf("| %c | %3d |\n",symbol.getKey(),symbol.getValue());
            sum += (int) symbol.getValue();
        }
        System.out.println("Sum of paired ASCII codes: "+sum);
        sum = 0;
        System.out.println("Group unpaired symbols");
        for (Map.Entry symbol:groupUnpairedSymbols.entrySet()) {
            System.out.printf("| %c | %3d |\n",symbol.getKey(),symbol.getValue());
            sum += (int) symbol.getValue();
        }
        System.out.println("Sum of unpaired ASCII codes: "+sum);
    }


}
