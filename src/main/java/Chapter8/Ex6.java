package Chapter8;


public class Ex6 {
    public static boolean isWord(String s){
        return s.codePoints().allMatch(Character::isAlphabetic);
    }
    public static boolean isValidJavaIdentifier(String s){
        if (s.isEmpty()) {
            return false;
        }

        int firstCodePoint = s.codePointAt(0);
        if (!Character.isJavaIdentifierStart(firstCodePoint)) {
            return false;
        }

        return s.codePoints().skip(Character.charCount(firstCodePoint))
                .allMatch(Character::isJavaIdentifierPart);
    }

    public static void main(String[] args) {
        System.out.println(isWord("66HelloWord"));
        System.out.println(isValidJavaIdentifier("_validIdentifier")); // true
        System.out.println(isValidJavaIdentifier("123Invalid")); // false
        System.out.println(isValidJavaIdentifier("valid$Identifier")); // true
    }
}
