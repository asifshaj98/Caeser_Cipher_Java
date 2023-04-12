package caesars.cipher;

public class CaesarsCipher {
    private static final char LETTER_A = 'a';
    private static final char LETTER_Z = 'z';
    private static final char CAPITAL_LETTER_A = 'A';
    private static final char CAPITAL_LETTER_Z = 'Z';
    private static final int ALPHABET_SIZE = 26;

    public String cipher(String message, int offset) {
        if (offset == 0) {
            return message;
        }
        offset = offset % ALPHABET_SIZE;
        char[] character = message.toCharArray();
        offsetBy(character, offset);
        return new String(character);
    }

    private void offsetBy(char[] character, int offset) {
        for (int i = 0; i < character.length; ++i) {
            if (character[i] != ' ') {
                if (Character.isUpperCase(character[i])) {
                    character[i] = offsetChar(character[i], offset, CAPITAL_LETTER_A, CAPITAL_LETTER_Z);
                } else {
                    character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
                }
            }
        }
    }

    private char offsetChar(char c, int offset, char letterA, char letterZ) {
        c += offset;
        if (c < letterA) {
            return (char) (c + ALPHABET_SIZE);
        }
        if (c > letterZ) {
            return (char) (c - ALPHABET_SIZE);
        }
        return c;
    }

    private char offsetCapitalChar(char c, int offset, char capitalLetterA, char capitalLetterZ) {
        c += offset;
        if (c < capitalLetterA) {
            return (char) (c + ALPHABET_SIZE);
        }
        if (c > capitalLetterZ) {
            return (char) (c - ALPHABET_SIZE);
        }
        return c;
    }
}
