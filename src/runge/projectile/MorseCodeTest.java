package runge.projectile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class MorseCodeTest
{

    @Test
    public void getPhrase()
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
        MorseCode morseCode = new MorseCode(morse, english);

        //when
        String phrase = String.valueOf(morseCode.getPhrase("hey"));

        //then
        Assertions.assertEquals(" .... , . , -.-- , ", phrase);
    }
}
