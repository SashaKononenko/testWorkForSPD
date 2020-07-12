package com.company.kononenko;


import java.util.*;

public class Sorter {
    private String text;
    private Map<Character, Integer> groupPairedSymbols;
    private Map<Character, Integer> groupUnpairedSymbols;
    private int sumPairedASCIIcodes;
    private int sumUnpairedASCIIcodes;
    private int subtractionResult;

    public Sorter() {
        text = "";
        groupPairedSymbols = new HashMap<>();
        groupUnpairedSymbols = new HashMap<>();
        sumPairedASCIIcodes = 0;
        sumUnpairedASCIIcodes = 0;
        subtractionResult = 0;
    }

    public void inputString(){
        Scanner in = new Scanner(System.in);
        text = in.next();
    }

    public void sort(){
        text = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) % 2 == 0) {
                if(groupPairedSymbols.put(text.charAt(i),(int)text.charAt(i)) == null )
                    sumPairedASCIIcodes += (int)text.charAt(i);
            } else {
                if(groupUnpairedSymbols.put(text.charAt(i),(int)text.charAt(i)) == null )
                    sumUnpairedASCIIcodes += (int)text.charAt(i);
            }
        }
    }
    public void subtraction(){
        subtractionResult = sumPairedASCIIcodes - sumUnpairedASCIIcodes;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Map<Character, Integer> getGroupPairedSymbols() {
        return groupPairedSymbols;
    }

    public Map<Character, Integer> getGroupUnpairedSymbols() {
        return groupUnpairedSymbols;
    }

    public int getSumPairedASCIIcodes() {
        return sumPairedASCIIcodes;
    }

    public int getSumUnpairedASCIIcodes() {
        return sumUnpairedASCIIcodes;
    }

    public int getSubtractionResult() {
        return subtractionResult;
    }

    public void printText(){
        System.out.println(text.length() > 0 ? text : "No text entered");
    }

    public void printSums(){
        System.out.println("Sum of paired ASCII codes: "+sumPairedASCIIcodes);
        System.out.println("Sum of unpaired ASCII codes: "+sumUnpairedASCIIcodes);
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
        System.out.println("\nGroup unpaired symbols");
        for (Map.Entry symbol:groupUnpairedSymbols.entrySet()) {
            System.out.printf("| %c | %3d |\n",symbol.getKey(),symbol.getValue());
            sum += (int) symbol.getValue();
        }
        System.out.println("Sum of unpaired ASCII codes: "+sum);
    }

    public void printSubtractionResult(){
        System.out.println("Sum of paired ASCII codes - Sum of unpaired ASCII codes = "+subtractionResult);
    }


}
