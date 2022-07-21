public class PigLatinTranslator {

    String translate(String input) {
        boolean translated = false;
        input = input.toLowerCase();

        //rule 4
        if (((input.length() == 2 && input.charAt(1) == 'y')) && !translated) {
            char charToBeMoved = input.charAt(0);
            input = input.substring(1) + charToBeMoved + "ay";
            translated = true;
        }
        
        // rule 3
        if ((isConsonant(input.charAt(0)) && input.substring(1, 3).equals("qu")) && !translated) {
            String stringToBeMoved = input.substring(q21, 3);
            input = input.substring(3) + stringToBeMoved + "ay";
            translated = true;
        }
        
        //rule 1
        if ((isVowelSound(input.charAt(0)) || isVowelSound(input.substring(0,2))) && !translated) {
            input += "ay";
            translated = true;
        }

        //rule 2
        if ((isConsonant(input.charAt(0))) && !translated) {
            char charToBeMoved = input.charAt(0);
            input = input.substring(1) + charToBeMoved + "ay";
            translated = true;
        }

        //rule 4

        return input;
    }

    Boolean isVowelSound(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }    
        return false;
    }

    Boolean isVowelSound(String c) {
        if (c == "xr" || c == "yt") {
            return true;
        }
        
        return false;
    }

    Boolean isConsonant(char c) {
        return !isVowelSound(c);
    }
}