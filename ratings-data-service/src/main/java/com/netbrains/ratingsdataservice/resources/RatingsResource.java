package com.netbrains.ratingsdataservice.resources;

import com.netbrains.ratingsdataservice.models.Rating;
import com.netbrains.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> listRating = Arrays.asList(
                new Rating("1", 4),
                new Rating("2", 5)
        );
        UserRating userRating = new UserRating();
        userRating.setRatings(listRating);
        return userRating;
    }

}
