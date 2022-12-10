public class Task18 {
    public static boolean isStrangePair(String first, String second) {
        if (first.isEmpty() && second.isEmpty())
            return true;
        if (first.isEmpty() || second.isEmpty())
            return false;
        return first.charAt(0) == second.charAt(second.length() - 1)
                && first.charAt(first.length() - 1) == second.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("isStrangePair(\"ratio\", \"orator\") -> " + isStrangePair("ratio", "orator"));
        System.out.println("isStrangePair(\"sparkling\", \"groups\") -> " + isStrangePair("sparkling", "groups"));
        System.out.println("isStrangePair(\"bush\", \"hubris\") -> " + isStrangePair("bush", "hubris"));
        System.out.println("isStrangePair(\"\", \"\") -> " + isStrangePair("", ""));
    }
}
