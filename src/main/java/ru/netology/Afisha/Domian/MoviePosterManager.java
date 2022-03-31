package ru.netology.Afisha.Domian;

import ru.netology.Afisha.MoviePoster;

public class MoviePosterManager {
    private MoviePoster[] items = new MoviePoster[0];
    private int lastMaxCount = 10;

    public MoviePosterManager() {
    }

    public MoviePosterManager(int lastCount) {
        this.lastMaxCount = lastCount;

    }

    public void add(MoviePoster item) {
        MoviePoster[] tmp = new MoviePoster[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = item;
        this.items = tmp;
    }

    public MoviePoster[] findAll() {
        return this.items;
    }

    public MoviePoster[] findLast() {
        int resultlength = Math.min(items.length, lastMaxCount);
        MoviePoster[] result = new MoviePoster[resultlength];
        for (int i = 0; i < resultlength; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;


    }


}
