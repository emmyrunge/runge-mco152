package runge.projectile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class MorseCodeTest
{

    @Test
    public void toMorseCode()
    {
        String [] morse = { ".-", "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", " "};
        char [] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};

        //given
        MorseCode morseCode = new MorseCode(morse, english);

        //when
        String phrase = morseCode.toMorseCode("hey you");

        //then
        //in between each letter is three spaces and word is six
        Assertions.assertEquals("....   .   -.--      -.--   ---   ..-   ", phrase);
    }

    @Test
    public void toEnglish()
    {
        String [] morse = { ".-", "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--.." };
        char [] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        //given
        MorseCode englishPhraseMaker = new MorseCode(morse, english);

        //when
        String morseCode = englishPhraseMaker.toMessage("....   .   -.--      -.--   ---   ..-");

        //then
        Assertions.assertEquals("hey you", morseCode);
    }
}
