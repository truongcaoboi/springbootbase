package com.tcb.test.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Date;

@Converter(autoApply = true)
public class ConverterLongToDatetime implements AttributeConverter<Long, Date> {
    @Override
    public Date convertToDatabaseColumn(Long aLong) {
        if(aLong != null && aLong > 0){
            return new Date(aLong);
        }else return null;
    }

    @Override
    public Long convertToEntityAttribute(Date date) {
        if(date != null){
            return date.getTime();
        }else{
            return null;
        }
    }
}
