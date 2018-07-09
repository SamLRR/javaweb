package com.patter;


public class Patter {
    private static final String words = "mama ela kashu, na dvore vesna!";
    private String[] arrayWords;

    public void start() {
        parsePatter(words);
        makePatter();
    }

    private String[] parsePatter(String words) {
        arrayWords = words.split(" ");
        return arrayWords;
    }

    private void makePatter() {
        StringBuilder sb = new StringBuilder();
        for (String word : arrayWords) {
            String flipFlop = changeLetter(word);
            sb.append(flipFlop + " ");
        }
        System.out.println(sb);

    }

    private String changeLetter(String word) {
        StringBuilder sb = new StringBuilder();
        char[] chars = word.toCharArray();
        if (!word.matches("^[a-zA-Z0-9]+$")) {
            int lastIndex = chars.length - 1;
            word = word.charAt(lastIndex) + word.substring(0, lastIndex);
            chars = word.toCharArray();
        }
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return new String(sb);
    }
}
