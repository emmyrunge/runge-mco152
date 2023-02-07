package runge.projectile;

public class MorseCode
{
    private final String[] morse;
    private final char[] english;

    public MorseCode(String[] morse, char[] english)
    {
        this.morse = morse;
        this.english = english;
    }

    public String toMorseCode(String phrase)
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
        return String.valueOf(morseSentence);
    }

    public String toMessage(String morseCode)
    {
        StringBuilder englishSentence = new StringBuilder();

        String [] morseCodeWord = morseCode.split("/");

        String [] morseCodeLetter = morseCode.split(" , ");


        //break down sentence to word
        //break down word to letter
        for (int i = 0; i < morseCodeWord.length; i++)
        {
            if (morseCode.equals("/"))
            {
                englishSentence.append("   ");
            }
            else
            {
                for (int j = 0; j < morseCodeLetter.length; j++)
                {
                    for(int k = 0; k < morse.length; k++)
                    {
                        if (morseCodeLetter[j].equals(morse[k]))
                        {
                            englishSentence.append(english[k]);
                            break;
                        }
                    }
                }
            }
        }
        return String.valueOf(englishSentence);
    }
}

