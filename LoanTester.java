package lesson10.extension;

import lesson10.LoanIssuer;
import lesson10.LoanTaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LoanTester {
    @Test
    public void testLoan() {
        LoanIssuer li1 = new LoanIssuer("Max", true, true);
        LoanTaker lt1 = new LoanTaker(21_000, 80, "Vasily");
        Assertions.assertFalse(
                li1.issue(lt1)
        );
        LoanIssuer li2 = new LoanIssuer("Maria", false, true);
        LoanTaker lt2 = new LoanTaker(30_000, 50, "Dima");
        Assertions.assertTrue(
                li2.issue(lt2)
        );
        LoanTaker lt3 = new LoanTaker(24_000, 30, "Tim");
        Assertions.assertFalse(
                li2.issue(lt3)
        );
        LoanTaker lt4 = new LoanTaker(40_000, 75, "Zak");
        Assertions.assertFalse(
                li2.issue(lt4)
        );
    }
}
