package com.tcb.test.validate.logic;

import com.tcb.test.validate.annotation.UniqueValidate;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.hibernate.validator.constraintvalidation.HibernateConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class LogicUniqueValue implements ConstraintValidator<UniqueValidate, String> {
    @Autowired
    ApplicationContext applicationContext;
    @Override
    public void initialize(UniqueValidate constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        Object root = constraintValidatorContext.unwrap(HibernateConstraintValidatorContext.class).getConstraintValidatorPayload(Object.class);
        new BeanWrapperImpl().getPropertyValue("id");
        return false;
    }
}
