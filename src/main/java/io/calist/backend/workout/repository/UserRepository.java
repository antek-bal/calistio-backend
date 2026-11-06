package io.calist.backend.workout.repository;

import io.calist.backend.workout.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {}
