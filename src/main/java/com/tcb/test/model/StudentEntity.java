package com.tcb.test.model;

import com.tcb.test.converter.ConverterLongToDatetime;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Entity
@Table(name = "students")
@NoArgsConstructor
@Data
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Length(max = 50, message = "Tên quá dài")
    private String name;
    @NotBlank
    @Length(min = 6, max = 8, message = "Mã quá ngắn hoặc quá dài")
    @Pattern(regexp = "^[\\d\\w]+$", message = "Chỉ cho phép chữ cái la tinh hoặc số")
    private String code;
    @NotNull
    private Long classId;
    @Convert(converter = ConverterLongToDatetime.class)
    private Date birth;
    private String originAddress;
}
