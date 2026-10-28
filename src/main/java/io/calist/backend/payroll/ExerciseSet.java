package io.calist.backend.payroll;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseSet {
    @Id
    @GeneratedValue
    private Long id;
    private Integer reps;
    private Integer set;
    private Integer holdSec;

    @ManyToOne
    @JoinColumn(name = "exercise_id", nullable = false)
    private Exercise exercise;

    @ManyToOne
    @JoinColumn(name = "session_id", nullable = false)
    private WorkoutSession workoutSession;
}
