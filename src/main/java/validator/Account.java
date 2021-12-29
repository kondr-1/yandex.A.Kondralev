package validator;

public class Account {
    private String name;
    private final static int MIN_LENGTH = 3;
    private final static int MAX_LENGTH = 19;

    public Account(String name) {
        this.name = name;
    }

    public Boolean checkNameToEmboss(String name) {
        if (isSizeOk(name)) {
            return checkSpace(name);
        }
        return false;
    }

    private static boolean isSizeOk(String str) {
        if (str != null) {
            return str.length() >= MIN_LENGTH && str.length() < MAX_LENGTH;
        }
        return false;
    }

    private boolean checkSpace(String name) {
        return name.matches("^[^\\s]+\\s[^\\s]+$");
    }
}