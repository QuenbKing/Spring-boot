package com.springboot.Module5Practice2.controller;

import com.springboot.Module5Practice2.config.Film;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film")
public class FilmController {
    private final Film film;

    public FilmController(Film film) {
        this.film = film;
    }

    @GetMapping
    private String getFilmInfo(){ return film.toString(); }

    @GetMapping("/name")
    private String getName(){ return film.getName(); }

    @GetMapping("/genre")
    private String getGenre(){ return film.getGenre(); }

    @GetMapping("/year")
    private Integer getYear(){ return film.getYearOfRelease(); }
}
