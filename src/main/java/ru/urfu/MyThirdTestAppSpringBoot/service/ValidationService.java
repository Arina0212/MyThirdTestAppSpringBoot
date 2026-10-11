package ru.urfu.MyThirdTestAppSpringBoot.service;

import org.springframework.validation.BindingResult;
import ru.urfu.MyThirdTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.urfu.MyThirdTestAppSpringBoot.exception.ValidationFailedException;

public interface ValidationService {

    void isValid(BindingResult bindingResult) throws ValidationFailedException;

    void checkUid(String uid) throws UnsupportedCodeException;
}
