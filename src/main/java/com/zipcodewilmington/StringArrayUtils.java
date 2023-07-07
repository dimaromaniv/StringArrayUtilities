package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {


        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        StringBuilder reverse = new StringBuilder();

        for ( int i = array.length; i > 0 ; i--) {

            reverse.append(array[i - 1]).append(" ");
        }
        String[] reversedArray = reverse.toString().split(" ");

        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        boolean isItTrue = true;
        boolean notTrue = false;

        for ( int i = 0 ; i < array.length - 1 ; i++ ) {
            for (int j = array.length-1 ; j >= 0 ; j--) {
                if (array[i].equals(array[j])){
                    return isItTrue;
                }
                else {return notTrue;
            }
        }}
        return  isItTrue;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean [] isItAllAlphabet = new boolean[26];

        for (int i = 0 ; i < array.length ; i ++) {
            String stringForNestedLoop = array[i];
            for ( int j = 0 ; j < stringForNestedLoop.length() ; j++) {
                char charOfsepparateWord = Character.toLowerCase(stringForNestedLoop.charAt(j));
                if ( Character.isLetter(charOfsepparateWord)) {
                    int index = charOfsepparateWord - 'a';
                    isItAllAlphabet[index] = true;
                }
            }
        }
        for (boolean used : isItAllAlphabet) {
            if (!used) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int counter = 0;

        for (int i = 0 ; i < array.length ; i++ ) {
            if (array[i].equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String>  newArray  = new ArrayList<>(Arrays.asList(array));

        for (int i = 0 ; i < newArray.size() - 1;  i++ ) {
            if (newArray.get(i) == valueToRemove) {
                newArray.remove(valueToRemove);
                i--;
            }

        }



        return newArray.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String>  newArray  = new ArrayList<>(Arrays.asList(array));

        for (int i = 0 ; i < newArray.size() - 1 ; i ++ ) {
            String firstIndex = newArray.get(i);
            String secondIndex = newArray.get(i+1);
            if (firstIndex == secondIndex) {
                newArray.remove(i);
                i--;
            }
        }

        return newArray.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String>  newArray  = new ArrayList<>(Arrays.asList(array));

        String addSameChars ;
        for (int i = 0 ; i < newArray.size()-1 ; i++) {

            String firstCharacter = newArray.get(i);
            String nextIndexCharacter = newArray.get(i+1);

            if (firstCharacter.charAt(0) == nextIndexCharacter.charAt(0)) {
                newArray.set(i , firstCharacter + nextIndexCharacter) ;
                newArray.remove(nextIndexCharacter);
                i--;
            }
        }
        return newArray.toArray(new String[0]);
    }
}
