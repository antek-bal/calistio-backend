package io.calist.backend.payroll;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutSession {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime startsAt;
    private LocalDateTime endsAt;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
