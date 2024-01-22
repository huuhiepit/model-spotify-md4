package org.cgh.app_spotify.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Entity(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The type name cannot be left blank")
    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "songs")
    private List<Song> songs;

    @OneToMany(mappedBy = "albums")
    private List<Album> albums;
}
