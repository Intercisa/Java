package app;

import cache.Cache;

public class Main {
    public static void main(String[] args) {
        Cache<String, String> cache = new Cache<>();
        for (int i = 0; i < 100; i++) {
            String key = getRandomInteger(2, 0) == 1 ? "A" : "B";
            cache.put(key , "aaaaaaa");

        }
    }

    public static int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }
}
