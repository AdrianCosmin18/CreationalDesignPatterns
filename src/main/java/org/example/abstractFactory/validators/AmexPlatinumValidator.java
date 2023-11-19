package org.example.abstractFactory.validators;

import org.example.abstractFactory.models.CreditCard;

public class AmexPlatinumValidator implements Validator  {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
