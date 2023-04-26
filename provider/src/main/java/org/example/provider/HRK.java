package org.example.provider;

import org.example.service.CurrencyConverter;
import org.example.service.annotation.CurrencyAnnotation;

@CurrencyAnnotation("HRK")
public class HRK implements CurrencyConverter {


    @Override
    public double getCurrency(double amount) {
        return amount * 0.66;
    }
}
