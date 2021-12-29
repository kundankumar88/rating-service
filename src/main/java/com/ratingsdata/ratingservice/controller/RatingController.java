package com.ratingsdata.ratingservice.controller;


import com.ratingsdata.ratingservice.ratingbean.RatingBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RatingController {


    @GetMapping("ratings/{movieId}")
    public RatingBean getRatings(@PathVariable("movieId") int movieId)
    {
        return new RatingBean(movieId,5,"Five Star Ratings");

    }
}
