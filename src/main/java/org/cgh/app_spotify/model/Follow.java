package org.cgh.app_spotify.model;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "follows")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Member member;

    private Artist artist;
}
