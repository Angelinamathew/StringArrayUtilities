package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Locale;

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
        Boolean result = false;
        for (int i=0; i< array.length; i++){
            if (array[i].equals(value)){
                result = true;
            }
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
       String[] str = new String[array.length];
       int k=0;
        for (int i= array.length-1; i>=0; i--){
            str[k]=array[i];
            k++;

        }
        return str;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversed = new String[array.length];
        reversed=reverse(array);
        boolean flag = true;
        for (int i=0; i<reversed.length;i++){
            if (!array[i].equals(reversed[i])) {
                flag=false;
                break;
            }
        }
        return flag;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        ArrayList<Character> myArr = new ArrayList<Character>();
        String str ="";
        int count = 0;
        Boolean result = false;
        for (int i=0; i< array.length; i++){
            str=str+array[i];
        }
        System.out.println(str);
        str=str.toLowerCase();
        for (int i=0; i<str.length();i++){
            int k= str.charAt(i);
                if (k>=65&&k<90 || k>=97&&k<=122){
                    if (!myArr.contains(str.charAt(i))){
                        myArr.add(str.charAt(i));
                        count++;
                    }
                }
            }
        System.out.println(myArr);
        System.out.println(count);
            if(count==26){
                result=true;
            }else {
                result=false;
            }

        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count =0;
        for(int i=0; i< array.length;i++){
            if (array[i].equals(value)){
                count++;
            }
        }
        return  count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int n = getNumberOfOccurrences(array,valueToRemove);
        String[] myArray = new String[array.length-n];
        int k=0;
        for (int i=0; i< array.length;i++){
            if(!(array[i].equals(valueToRemove))){
                myArray[k]=array[i];
                k++;
            }
        }
        return myArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if(!array[i-1].equals(array[i])){
                myArray.add(array[i]);
            }

        }
        String[] result = myArray.toArray(new String[myArray.size()]);

        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add(array[0]);

        for (int i=1; i< array.length; i++){
            if(array[i-1].equalsIgnoreCase(array[i])){
                String last = arr.get(arr.size()-1);
                last=last.concat(array[i]);
                arr.set(arr.size()-1, last);
            }else{
                arr.add(array[i]);
            }
        }
        String[] newArray = arr.toArray(new String[arr.size()]);
        return newArray;
    }


}
