package io.calist.backend.workout.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseMuscle {
    @Id
    @GeneratedValue
    private Long id;
    private EngagementType engagementType;
    private MuscleRole muscleRole;

    @ManyToOne
    @JoinColumn(name = "exercise_id", nullable = false)
    private Exercise exercise;

    @ManyToOne
    @JoinColumn(name = "muscle_id", nullable = false)
    private Muscle muscle;
}
