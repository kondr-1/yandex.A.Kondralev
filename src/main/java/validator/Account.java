package validator;

public class Account {
    private String name;
    private final static int MIN_LENGTH = 3;
    private final static int MAX_LENGTH = 20;

    public Account(String name) {
        this.name = name;
    }

    public Boolean checkNameToEmboss(String name) {
        if (isSizeOk(name)) {
            if (hasStrWhiteSpacesBeforeOrAfter(name)) {
                if (hasStrOnlyOneWhiteSpace(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isSizeOk(String str) {
        return str.length() >= MIN_LENGTH && str.length() < MAX_LENGTH;
    }

    private static boolean hasStrWhiteSpacesBeforeOrAfter(String str) {
        return str.trim().length() == str.length();
    }

    private static boolean hasStrOnlyOneWhiteSpace(String str) {
        return str.trim().replaceAll(" ", "").length() + 1 == str.trim().length();
    }
}