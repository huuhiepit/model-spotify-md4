package org.cgh.app_spotify.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity(name = "libraries")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "playlist")
    private List<Playlist> playlist;
}
