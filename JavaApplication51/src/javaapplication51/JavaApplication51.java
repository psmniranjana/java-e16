/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);
        
        
        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);
        
        int ageLimit = scanner.nextInt();
        
        for (String emp : nameArr){
            //your code goes here
            if(ages.get(emp)< ageLimit)
            ages.remove(emp);
        }
        
        System.out.println(ages);
    }
}
        
        
        
    

