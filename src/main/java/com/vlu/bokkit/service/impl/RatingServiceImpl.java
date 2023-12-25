package com.vlu.bokkit.service.impl;

import com.vlu.bokkit.dto.RatingDTO;
import com.vlu.bokkit.entity.Rating;
import com.vlu.bokkit.exception.RatingCommentAndStarNoValue;
import com.vlu.bokkit.exception.RatingNotFoundException;
import com.vlu.bokkit.repository.RatingRepository;
import com.vlu.bokkit.service.RatingService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    private final RatingRepository ratingRepository;

    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }


    @Override
    public RatingDTO setRating(RatingDTO rating) {
        if (rating.getComment() == null || rating.getComment() == null)
        {
            throw new RatingCommentAndStarNoValue();
        }
        ratingRepository.save(converRatingDTOtoEnity(rating));
        return rating;
    }

    public RatingDTO updateRating (RatingDTO newRating, Long id)
    {
         Rating rating =  ratingRepository.findById(id).get();
         if (rating == null)
         {
             throw new RatingNotFoundException(id);
         }
         if (newRating.getStar() == null || newRating.getComment() == null)
         {
             throw new RatingCommentAndStarNoValue();
         }
         rating.setComment(newRating.getComment());
         rating.setStar(newRating.getStar());

         ratingRepository.save(rating);
         return converRatingToDTO(rating);
    }
    public List<Rating> getAllRating()
    {
        return ratingRepository.findAll();
    }

    public void deleteRating(Long id)
    {
        if (!ratingRepository.existsById(id))
        {
            throw new RatingNotFoundException(id);
        }
        ratingRepository.deleteById(id);
    }
    private RatingDTO converRatingToDTO(Rating currentRating)
    {
        RatingDTO ratingDTO = new RatingDTO();
        return ratingDTO.builder()
                .id(currentRating.getId())
                .comment(currentRating.getComment())
                .star(currentRating.getStar())
                .build();
    }
    private Rating converRatingDTOtoEnity(RatingDTO ratingDTO)
    {
        Rating rating = new Rating();
        BeanUtils.copyProperties(ratingDTO,rating);
        return rating;
    }
}
