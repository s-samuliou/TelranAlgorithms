package com.telran.org.lessonsix;

import java.util.HashMap;
import java.util.Map;

public class FrequencyDictionary {
    static final String TEXT =
            "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Accusamus, maiores obcaecati rem" +
            " numquam qwertyuiopasdfghjklzxcvbnm deserunt itaque voluptatum? Numquam veniam non, atque libero ipsa officiis dolor " +
            "obcaecati ipsam magni? Officia consectetur vitae inventore amet consequuntur praesentium ab dicta";

    public static void main(String[] args) {
        HashMap<Character, Integer> letterFrequencyMap = new HashMap<>();

        for (char c : TEXT.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowercaseChar = Character.toLowerCase(c);
                letterFrequencyMap.put(lowercaseChar, letterFrequencyMap.getOrDefault(lowercaseChar, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> element : letterFrequencyMap.entrySet()) {
            System.out.println("Key: " + element.getKey() + " Value: " + element.getValue());
        }
    }
}
