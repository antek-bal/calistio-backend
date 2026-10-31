package io.calist.backend.workout.repository;

import io.calist.backend.workout.entity.WorkoutPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutPlanRepository extends JpaRepository<WorkoutPlan, Long> {
}
