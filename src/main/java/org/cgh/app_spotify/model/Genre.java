package org.cgh.app_spotify.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity(name = "genres")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Genre must not be empty")
    @Size(min = 5, max = 255, message = "Genre must not be more than 255 characters")
    private String name;

    @OneToMany(mappedBy = "genre")
    private List<Song> songs;

}
