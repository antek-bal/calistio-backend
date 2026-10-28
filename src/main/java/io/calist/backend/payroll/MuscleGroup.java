package io.calist.backend.payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MuscleGroup {
    @Id
    @GeneratedValue
    private Long id;
    private String muscleName;
    private PushPull pushPull;
    private UpperLower upperLower;
}
