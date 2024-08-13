// Anagram Detection 7 Kyu

// An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).

// Note: anagrams are case insensitive

// Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.

// Examples

// "foefet" is an anagram of "toffee"

// "Buckethead" is an anagram of "DeathCubeK"

import java.util.*;

public class program {
    public static boolean isAnagram(String test, String original) {
        if(test == null || original == null){
          return false;
        }
        char[] arr1 = test.toLowerCase().toCharArray();
        char[] arr2 = original.toLowerCase().toCharArray();
        if(arr1.length != arr2.length) return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
          return true;
        }
        return false;
      }
}
    
