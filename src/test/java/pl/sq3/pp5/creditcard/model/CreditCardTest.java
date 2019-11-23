package pl.sq3.pp5.creditcard.model;

import org.junit.Assert;
import org.junit.Test;
import pl.sq3.pp5.creditcard.model.CreditCard;

import java.math.BigDecimal;

public class CreditCardTest {

    public static final int INITIAL_LIMIT = 1000;

    @Test
    public void itAllowAssignLimitToCreditCard() {
        //Arrange   // Given
        CreditCard creditCard = new CreditCard();
        //Act       // When
        creditCard.assignLimit(BigDecimal.valueOf(INITIAL_LIMIT));
        //Asset     // Then
        Assert.assertEquals(creditCard.limit(), BigDecimal.valueOf(INITIAL_LIMIT));
    }

    @Test
    public void denyAssignLimitBelowMinimum() {

        CreditCard creditCard = new CreditCard();

        try {
            creditCard.assignLimit(BigDecimal.valueOf(500));
            Assert.fail("Exception should be thrown");
        } catch(CreditCardBelowLimitException e) {
            Assert.assertTrue(true );
        }


    }


}
