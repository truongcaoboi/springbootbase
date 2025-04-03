package com.tcb.test.validate.annotation;

import com.tcb.test.validate.logic.LogicUniqueValue;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = LogicUniqueValue.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueValidate {
    String message() default "Giá trị đã tồn tại";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
