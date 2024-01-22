package org.cgh.app_spotify.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity(name = "artists")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The artist name cannot be left blank")
    @Size(min = 5, max = 300, message = "Artist name cannot exceed 255 characters")
    private String name;

    @NotBlank(message = "The artist description cannot be left blank")
    private String description;

    private String urlImage;

    @OneToMany
    private List<Song> songs;

}
