package runge.projectile;

import org.junit.jupiter.api.Test;

public class MorseCodeTest
{

    @Test
    public void getPhrase()
    {
        String [] morse = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--.." };
        char [] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        //given
        MorseCode morseCode = new MorseCode(morse, english);

        //when
        String phrase = "is this gonna work?";

        //then
        morseCode.getPhrase(phrase);
    }
}
