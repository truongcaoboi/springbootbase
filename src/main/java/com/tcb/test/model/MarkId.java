package com.tcb.test.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class MarkId implements Serializable {
    private Long studentId;
    private Long subjectId;
}
