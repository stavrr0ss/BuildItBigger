package ro.atoming.javajokeslibrary;

import java.util.Random;

public class JavaJoke {
    private static String joke1 =
            "I recently decided to sell my vacuum cleaner as all it was doing was gathering dust.";
    private static String joke2 =
            "I always wanted to be somebody, but I guess I should've been more specific.";
    private static String joke3 =
            "I wonder if Halloween is the one day of the year Lady Gaga wears sensible slacks.";
    private static String joke4 =
            "A man walks into a bar with a chunk of asphalt under one arm. " +
                    "The man says, \"Beer, please, and one for the road.\"";
    private static String joke5 =
            "An SEO expert walks into a bar, bars, pub, tavern, public house, Irish pub, drinks, beer, alcohol";
    private static String joke6 =
            "Whoever said \"It’s not whether you win or lose that counts\" probably lost." ;


    public static String[] jokes = { joke1,joke2,joke3,joke4,joke5};

    public static String tellJoke(){
        int size = jokes.length;
        Random randomJoke = new Random();
        int index = randomJoke.nextInt(size);
        return jokes[index];
    }
}
