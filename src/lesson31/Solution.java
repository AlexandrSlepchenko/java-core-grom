package lesson31;

import java.util.TreeMap;

public class Solution {

    public TreeMap<Character, Integer> countSymbols(String text) {
        TreeMap<Character, Integer> symbols = new TreeMap();

        char[] letters = text.toCharArray();

        for (Character l : letters) {
            if (Character.isLetter(l)) {
                if (!symbols.containsKey(l)) {
                    symbols.put(l, 1);
                } else {
                    symbols.put(l, symbols.get(l) + 1);
                }
            }
        }

        return symbols;
    }

    public TreeMap<String, Integer> words(String text) {
        TreeMap<String, Integer> result = new TreeMap();

        String[] words = text.split(" ");

        for (String w : words) {
            if (w.length() > 1) {
                if (!result.containsKey(w)) {
                    result.put(w, 1);
                } else {
                    result.put(w, result.get(w) + 1);
                }
            }
        }

        return result;
    }
}
