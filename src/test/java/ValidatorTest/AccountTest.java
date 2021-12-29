package ValidatorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import validator.Account;

import java.util.stream.Stream;

public class AccountTest {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("B LACK", true),
                Arguments.of("GRE Y", true),
                Arguments.of("GR EY", true),
                Arguments.of("G E", true),
                Arguments.of("ddadfdadfdfdf asdf", true),
                Arguments.of("BLACK", false),
                Arguments.of(" GREY", false),
                Arguments.of("GREY ", false),
                Arguments.of(" GREY ", false),
                Arguments.of("adfdfadfdf asdfsadf", false),
                Arguments.of("adfdfadfdf asdfsadfk", false),
                Arguments.of("ad", false),
                Arguments.of(" GR EY ", false),
                Arguments.of("GR  EY", false),
                Arguments.of("", false),
                Arguments.of(null, false));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void checkNameToEm3boss(String name, boolean expected) {
        Account account = new Account(name);
        Assertions.assertEquals(account.checkNameToEmboss(name), expected);
    }
}