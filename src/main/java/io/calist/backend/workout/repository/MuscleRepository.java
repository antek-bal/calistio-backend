package io.calist.backend.workout.repository;

import io.calist.backend.workout.entity.Muscle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuscleRepository extends JpaRepository<Muscle, Long> {
}
