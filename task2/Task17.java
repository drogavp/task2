public class Task17 {
    public static boolean isValid(String code) {
        return code.length() == 5
                && code.chars().allMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        System.out.println("isValid(\"59001\") -> " + isValid("59001"));
        System.out.println("isValid(\"853a7\") -> " + isValid("853a7"));
        System.out.println("isValid(\"732 32\") -> " + isValid("732 32"));
        System.out.println("isValid(\"393939\") -> " + isValid("393939"));
    }
}
