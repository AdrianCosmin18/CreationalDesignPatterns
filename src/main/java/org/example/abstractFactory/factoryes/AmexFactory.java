package org.example.abstractFactory.factoryes;

import org.example.abstractFactory.models.AmexGoldCreditCard;
import org.example.abstractFactory.models.AmexPlatinumCreditCard;
import org.example.abstractFactory.models.CardType;
import org.example.abstractFactory.models.CreditCard;
import org.example.abstractFactory.validators.AmexGoldValidator;
import org.example.abstractFactory.validators.AmexPlatinumValidator;
import org.example.abstractFactory.validators.Validator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType) {
            case GOLD: {
                return new AmexGoldCreditCard();
            }
            case PLATINUM: {
                return new AmexPlatinumCreditCard();
            }
            default:
                throw new IllegalStateException("Invalid cardType: " + cardType);
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {

        switch (cardType) {
            case GOLD: {
                return new AmexGoldValidator();
            }
            case PLATINUM: {
                return new AmexPlatinumValidator();
            }
            default:
                throw new IllegalStateException("Invalid cardType: " + cardType);
        }
    }
}
