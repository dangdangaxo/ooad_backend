package com.vlu.bokkit.controller;

import com.vlu.bokkit.dto.RatingDTO;
import com.vlu.bokkit.entity.Rating;
import com.vlu.bokkit.service.impl.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("rating")
public class RatingController {
    private final RatingServiceImpl ratingService;

    @Autowired
    public RatingController(RatingServiceImpl ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping("/newrating")
    public RatingDTO createNewRating(@RequestBody RatingDTO rating)
    {
        return ratingService.setRating(rating);
    }
    @GetMapping("/getallrating")
    public List<Rating> getAllRating()
    {
        return ratingService.getAllRating();
    }

    @PutMapping("/updaterating/{id}")
    public RatingDTO updateRating(@RequestBody RatingDTO newRating, @PathVariable Long id)
    {
        return ratingService.updateRating(newRating,id);
    }

    @DeleteMapping("/deleterating/{id}")
    public String deleteRating(@PathVariable Long id)
    {
        ratingService.deleteRating(id);
        return "Rating with id: " + id + "has been removed";
    }
}
