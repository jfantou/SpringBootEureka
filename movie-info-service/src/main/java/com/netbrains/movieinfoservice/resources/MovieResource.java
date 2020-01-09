package com.netbrains.movieinfoservice.resources;

import com.netbrains.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping("{movieId}")
    public Movie getCatalog(@PathVariable("movieId") String movieId){
        return new Movie(movieId, "testName");
    }

}
