package io.calist.backend.workout.repository;

import io.calist.backend.workout.entity.ExerciseSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseSetRepository extends JpaRepository<ExerciseSet, Long> {
}
