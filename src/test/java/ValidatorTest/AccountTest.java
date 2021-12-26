package ValidatorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import validator.Account;

public class AccountTest {
    @ParameterizedTest
    @ValueSource(
            strings = {
                    "BLACK",
                    " GREY",
                    "GREY ",
                    " GREY ",
                    "adfdfadfdfdf asdfsadfadfdasf",
                    "ad",
                    " GR EY ",
                    ""
            }
    )
    void checkNameToEmbossFalse(String name) {
        Account account = new Account(name);
        Assertions.assertFalse(account.checkNameToEmboss(name));
    }

    @ParameterizedTest
    @ValueSource(
            strings = {
                    "B LACK",
                    "GRE Y",
                    "GR EY",
                    "G E",
                    "ddadfdfadfdfdf asdf"
            }
    )
    void checkNameToEmbossTrue(String name) {
        Account account = new Account(name);
        Assertions.assertTrue(account.checkNameToEmboss(name));
    }
}