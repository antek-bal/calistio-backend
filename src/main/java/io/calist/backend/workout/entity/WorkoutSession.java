package io.calist.backend.workout.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutSession {
  @Id @GeneratedValue private Long id;
  private LocalDateTime startsAt;
  private LocalDateTime endsAt;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private AppUser appUser;
}
