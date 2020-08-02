package main.java.detectcapital;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }

    public boolean detectCapitalUseIterative(String word) {
        if(word.length() == 1) return true;
        return (allLetterUpper(word) || allLetterLower(word) || onlyFirst(word));
    }

    private boolean onlyFirst(String word) {
        if(isFirstUpperCase(word))
            if(allLetterLower(word.substring(1))) return true;

        return false;
    }

    private boolean isFirstUpperCase(String word) {
        return Character.isUpperCase(word.charAt(0));
    }

    private boolean allLetterUpper(String word) {
        for (char c : word.toCharArray())
            if(!Character.isUpperCase(c)) return false;
        return true;
    }

    private boolean allLetterLower(String word) {
        for (char c : word.toCharArray())
            if(Character.isUpperCase(c)) return false;
        return true;
    }
}
