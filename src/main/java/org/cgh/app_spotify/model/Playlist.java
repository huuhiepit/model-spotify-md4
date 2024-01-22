package org.cgh.app_spotify.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;


@Entity(name = "playlists")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The playlist title cannot be left blank")
    @Size(max = 300, message = "Playlist title cannot exceed 255 characters")
    private String title;

    @ManyToMany
    private List<Song> songs;

//    private Account account;
}
