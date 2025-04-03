package com.tcb.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "marks")
@IdClass(MarkId.class)
@Data
@NoArgsConstructor
public class MarkEntity {
    @Id
    private Long studentId;
    @Id
    private Long subjectId;
    private String mark;
}
