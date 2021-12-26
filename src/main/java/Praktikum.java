import validator.Account;

public class Praktikum {
    private static String cardName = "dfdfafs";

    public static void main(String[] args) {
        Account account = new Account(cardName);
        System.out.println(account.checkNameToEmboss(cardName));
    }
}