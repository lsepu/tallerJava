package com.sofka.exercise11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElevenExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String phrase = sc.nextLine();
        char[] vowels = {'a','e','i','o','u'};
        System.out.println("La longitud de la frase (incluyendo espacios) es de: " + phrase.length());


        HashMap<Character, Integer> countVowels = new HashMap<Character, Integer>();
        for(char vowel : vowels){
            countVowels.put(vowel,0);
        }

        //count vowels
        for(int i = 0; i <= phrase.length()-1; i++){
            char letter = phrase.charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                countVowels.put(letter, countVowels.get(letter) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : countVowels.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
