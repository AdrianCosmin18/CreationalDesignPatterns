package org.example.abstractFactory.factoryes;

import org.example.abstractFactory.models.CardType;
import org.example.abstractFactory.models.CreditCard;
import org.example.abstractFactory.validators.Validator;

// Abstract Factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
