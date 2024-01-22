package org.cgh.app_spotify.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.cgh.app_spotify.model.enumcations.ERole;

@Entity(name = "accounts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Account name must not be empty")
    @Size(min = 5, message = "Account name must not be less than 5 characters")
    @Column(unique = true)
    private String username;

    @NotBlank(message = "Account password must not be empty")
    @Size(min = 10, message = "Account password must not be less than 10 characters")
    private String password;

    @Enumerated(EnumType.STRING)
    private ERole role;
}
