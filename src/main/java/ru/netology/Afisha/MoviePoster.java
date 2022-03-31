package ru.netology.Afisha;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MoviePoster {
    private int id;
    private String movieName;
    private int year;
}
