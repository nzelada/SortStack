package SortStack;

import java.io.FileNotFoundException;

import java.util.Arrays;

import java.util.Stack;

/**
 * ************************************************************
 * Purpose/Description: <This program will get the stack and sort it>
 * Author’s Panther ID: 
 * Certification:I hereby certify that this work is my own and none of it is the
 * work of any other person.
*************************************************************
 */
public class SortStack {
/**
 * This method will get the stack and while it's not empty it will sort it out.
 * @param s gets the stack
 * @return the stack sorted out
 */
    public static Stack<Integer> sort(Stack<Integer> s) {
      
        Stack<Integer> numList = new Stack<>(); // new stack

        while (!s.isEmpty()) { // while it's not empty
            int e = s.pop(); // removes first items and assigns it to e
            while (!numList.isEmpty() && (numList.peek() < e)) { 
                s.push(numList.pop()); // puts numList to s
            }
            numList.push(e);// puts e in numList
        }
        return numList; // returns numList
    }

    /**
     * The main will make the program come together and test the methods
     */
    public static void main(String[] args) {
       
        
        Stack<Integer> s = new Stack<>(); // new stack
     
        s.push(5); // puts number into stack s
        s.push(3); // puts number into stack s
        s.push(1); // puts number into stack s
        s.push(4); // puts number into stack s
        s.push(2); // puts number into stack s
        s.push(8); // puts number into stack s
        s.push(6); // puts number into stack s
        s.push(9); // puts number into stack s
        s.push(7); // puts number into stack s
        s.push(10); // puts number into stack s

        System.out.println("Before the sorting: " + s.toString().replace("[", "").replace("]", "")); // print
        s = SortStack.sort(s); // sorts it out

        System.out.print("After the sorting: "); // print after the sort
        while (!s.isEmpty()) { // if not empty print the sorted list
            System.out.print(s.pop() + " ");
        }
        System.out.println(); // new line
    } 

}
