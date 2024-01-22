package org.cgh.app_spotify.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.cgh.app_spotify.model.enumcations.EGender;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity(name = "members")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The member name cannot be left blank")
    @Size(max = 300, message = "Member name cannot exceed 255 characters")
    private String name;

    @NotBlank(message = "The member email cannot be left blank")
    @Size(max = 300, message = "Member email cannot exceed 255 characters")
    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private EGender gender;

    @NotNull(message = "Day of birth cannot be null")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private LocalDate dob;

    @NotNull
    private String national;

    private String urlImage;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
