package ru.dmitrychin.entity;

import org.hibernate.annotations.CreationTimestamp;
import ru.dmitrychin.entity.enums.UserState;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.GenerationType;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "app_user")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long telegramUserId;
    @CreationTimestamp
    private LocalDateTime firstLoginDate;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private Boolean isActive;
    @Enumerated(EnumType.STRING)
    private UserState state;
}
