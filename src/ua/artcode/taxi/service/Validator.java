package ua.artcode.taxi.service;

import ua.artcode.taxi.exception.InputDataWrongException;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.model.Address;

public interface Validator {

    boolean validateLogin(String phone, String password) throws Exception;
    boolean validateRegistration(String phone) throws RegisterException;
    boolean validateAddress(Address address) throws InputDataWrongException;
    boolean validateChangeRegistration(String id, String phone) throws RegisterException;
}
