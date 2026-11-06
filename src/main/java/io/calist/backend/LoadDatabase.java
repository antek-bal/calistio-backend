package io.calist.backend;

import io.calist.backend.workout.entity.*;
import io.calist.backend.workout.repository.ExerciseRepository;
import io.calist.backend.workout.repository.MuscleRepository;
import io.calist.backend.workout.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initExercises(ExerciseRepository repository) {
    return args -> {
      log.info(
          "Preloading "
              + repository.save(
                  Exercise.builder()
                      .name("Pull-up")
                      .description("Classic pull-up with overhand grip")
                      .build()));
      log.info(
          "Preloading "
              + repository.save(
                  Exercise.builder().name("Push-up").description("Classic push-up").build()));
    };
  }

  @Bean
  CommandLineRunner initMuscles(MuscleRepository repository) {
    return args -> {
      log.info(
          "Preloading "
              + repository.save(
                  Muscle.builder()
                      .name("Bicep")
                      .pushPull(PushPull.PULL)
                      .upperLower(UpperLower.UPPER)
                      .build()));
      log.info(
          "Preloading "
              + repository.save(
                  Muscle.builder()
                      .name("Tricep")
                      .pushPull(PushPull.PUSH)
                      .upperLower(UpperLower.UPPER)
                      .build()));
      log.info(
          "Preloading "
              + repository.save(
                  Muscle.builder()
                      .name("Rectus abdominis")
                      .pushPull(PushPull.CORE)
                      .upperLower(UpperLower.CORE)
                      .build()));
    };
  }

  @Bean
  CommandLineRunner initUsers(UserRepository repository) {
    return args -> {
      log.info(
          "Preloading "
              + repository.save(
                  AppUser.builder()
                      .username("jdoe1")
                      .email("johndoe@example.com")
                      .password("password123")
                      .firstName("John")
                      .lastName("Doe")
                      .gender(Gender.MALE)
                      .heightCm(180)
                      .weightKg(75)
                      .build()));
    };
  }
}
