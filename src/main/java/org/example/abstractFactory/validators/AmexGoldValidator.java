package org.example.abstractFactory.validators;

import org.example.abstractFactory.models.CreditCard;

public class AmexGoldValidator implements Validator{

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
