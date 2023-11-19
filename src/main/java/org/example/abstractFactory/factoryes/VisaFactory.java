package org.example.abstractFactory.factoryes;

import org.example.abstractFactory.models.CardType;
import org.example.abstractFactory.models.CreditCard;
import org.example.abstractFactory.models.VisaGoldCreditCard;
import org.example.abstractFactory.models.VisaPlatinumCreditCard;
import org.example.abstractFactory.validators.Validator;
import org.example.abstractFactory.validators.VisaValidator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();

            case PLATINUM:
                return new VisaPlatinumCreditCard();

        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }
}
