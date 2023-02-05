package runge.projectile;

import java.util.Arrays;

public class MorseCode
{
    private final String[] morse;
    private final char[] english;

    public MorseCode(String[] morse, char[] english)
    {
        this.morse = morse;
        this.english = english;
    }

    public StringBuilder getPhrase(String phrase)
    {
        StringBuilder morseSentence = new StringBuilder(" ");


        for (int i = 0; i < phrase.length(); i++)
        {
            if (phrase.charAt(i) == ' ')
            {
                morseSentence.append("/");
            }
            else
            {
                for (int j = 0; j < english.length; j++)
                {

                    if (phrase.charAt(i) == english[j])
                    {
                        morseSentence.append(morse[j] + " , ");
                        break;
                    }
                }
            }
        }
        return morseSentence;
    }
}

