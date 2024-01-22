package org.cgh.app_spotify.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Album must not be empty")
    @Size(min = 5, max = 255, message = "Album must not be more than 255 characters")
    private String name;

    @ManyToMany
    private List<Song> songs;
}
