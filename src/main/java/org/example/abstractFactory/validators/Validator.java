package org.example.abstractFactory.validators;

import org.example.abstractFactory.models.CreditCard;

public interface Validator {
    public boolean isValid(CreditCard creditCard);
}
