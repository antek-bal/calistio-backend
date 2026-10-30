package io.calist.backend.workout.repository;

import io.calist.backend.workout.entity.WorkoutSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutSessionRepository extends JpaRepository<WorkoutSession, Long> {
}
