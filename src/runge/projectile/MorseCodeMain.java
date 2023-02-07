package runge.projectile;

public class MorseCodeMain
{
    public static void main(String [] args)
    {
        String [] morse = { ".-", "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---", ".--.",
                "--.-", ".-.",  "...",  "-", "..-",  "...-", ".--",
                "-..-", "-.--", "--..", ".----", "..---", "...--",
                "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "..--..", ".-.-.-", "--..--", "-.-.-.", "---..." };

        char [] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2',
                '3', '4', '5', '6', '7', '8', '9', '0', '?', '.', ',', ';', ':'};

        String phrase = "is this gonna work?";


        MorseCode morsecode = new MorseCode(morse, english);

        System.out.println("Translation is: \n" + morsecode.toMorseCode(phrase));

    }
}
