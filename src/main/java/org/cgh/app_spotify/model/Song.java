package org.cgh.app_spotify.model;

import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity(name = "songs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The song name cannot be left blank")
    @Size(max = 300, message = "Song name cannot exceed 255 characters")
    private String name;

    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private LocalDate dateCreated;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
}
