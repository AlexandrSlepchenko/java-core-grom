package lesson17;

public class Solution {

    public int countWords(String input) {
        int count = 0;
        boolean w = false;
        int enfOdString = input.length() - 1;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)) && i != enfOdString) {
                w = true;
            } else if (!Character.isLetter(input.charAt(i)) && w) {
                count++;
                w = false;
            } else if (Character.isLetter(input.charAt(i)) && i == enfOdString) {
                count++;
            }
        }
        return count;
    }

    static String maxWord(String input) {
        String[] results = input.split(" ");
        String maxWord = null;
        if (results.length == 0) return null;

        for (String result : results) {
            if (result.length() > 0 && wordCheck(result)) {
                maxWord = result;
                break;
            }
        }

        if (maxWord == null) return null;

        for (String result : results) {
            if (result.length() > maxWord.length() && wordCheck(result)) maxWord = result;
        }
        return maxWord;
    }

    public static String minWord(String input) {
        String[] worlds = input.split(" ");
        String minWorld = null;

        if (worlds.length == 0) {
            return null;
        }
        for (String world : worlds) {
            if (world.length() > 0 && wordCheck(world)) {
                minWorld = world;
                break;
            }
        }

        if (minWorld == null) {
            return null;
        }
        for (String world : worlds) {
            for (String w : worlds)
                if (w.length() < world.length() && wordCheck(w))
                    minWorld = w;
        }

        return minWorld;
    }

    public static String mostCountedWord(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        String[] words = input.split("\\s");
        int maxCount = 0;
        String mostRepetebleWord = null;

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j]) && wordCheck(words[i])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostRepetebleWord = words[i];
            }
        }
        return mostRepetebleWord;
    }

    public static boolean validate(String adress) {
        if (!adress.startsWith("http://") && !adress.startsWith("https://"))
            return false;

        if (!adress.endsWith(".com") && !adress.endsWith(".net") && !adress.endsWith(".org"))
            return false;

        adress = adress.replace("www.", "");
        adress = isValid(adress, new String[]{"http://", "https://"});
        adress = isValid(adress, new String[]{".com", ".net", ".org"});

        return adress != null && wordCheck(adress);


    }

    private static String isValid(String adress, String[] parts) {
        for (String part : parts) {
            if (adress.contains(part)) {
                adress = adress.replace(part, "");
                return adress;
            }
        }
        return null;
    }

    private static boolean dogTest(String input) {
        char[] chars = input.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == '@') {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean znakTest(String input) {
        String[] test = input.split("://");
        if (test.length > 1) ;
        return false;
    }

    private static boolean worldsWalid(String input) {
        String[] worlds = input.split("@");
        for (String world : worlds) {
            if (wordCheck(world) == false)
                return false;
        }
        return true;
    }


    private static boolean wordCheck(String input) {
        char[] letters = input.toCharArray();
        for (char letter : letters) {
            if (!Character.isLetter(letter) && !Character.isDigit(letter)) {
                return false;
            }
        }
        return true;
    }
}
