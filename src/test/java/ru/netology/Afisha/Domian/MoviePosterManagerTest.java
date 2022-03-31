package ru.netology.Afisha.Domian;

import org.junit.jupiter.api.Test;
import ru.netology.Afisha.MoviePoster;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoviePosterManagerTest {

    @Test
    void findLast() {
        var manager = new MoviePosterManager(4);
        for (int i = 1; i <= 10; i++) {
            manager.add(new MoviePoster(i, "Test" + i, 2022 - i));

        }
        MoviePoster[] actual = manager.findLast();
        System.out.println(Arrays.toString(actual));
        assertEquals(4, actual.length);
    }

    @Test
    void findAll() {
        var manager = new MoviePosterManager();
        for (int i = 1; i <= 10; i++) {
            manager.add(new MoviePoster(i, "Test" + i, 2022 - i));

        }
        MoviePoster[] actual = manager.findAll();
        System.out.println(Arrays.toString(actual));
        assertEquals(10, actual.length);
    }

    @Test
    void add() {
        MoviePosterManager manager = new MoviePosterManager();


        manager.add(new MoviePoster(1, "Bladshot", 2022));
        manager.add(new MoviePoster(2, "Vpered", 2020));
        manager.add(new MoviePoster(3, "Djentelmeni", 2019));

        manager.add(new MoviePoster(4, "Nomer odin", 2018));

        MoviePoster[] actual = manager.findAll();
        System.out.println(Arrays.toString(actual));
        assertEquals(4, actual.length);

    }
}
