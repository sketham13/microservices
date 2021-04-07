package com.sneha.ratingsdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sneha.ratingsdataservice.models.Rating;
import com.sneha.ratingsdataservice.models.UserRating;
//import com.sneha.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {
	
	@RequestMapping("/{bookid}")
	public Rating getRating(@PathVariable("bookid") String bookid) {
	return new Rating(bookid, 5);
	}

	@RequestMapping("users/{userID}")
	public UserRating getUserRating(@PathVariable("userID") String userID) {
		List<Rating> ratings = Arrays.asList(
	    		new Rating("1234",4),
	    		new Rating("2345",5));
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
		
		
	}

}
	
    
    
    
	
	
	
	
	
	


