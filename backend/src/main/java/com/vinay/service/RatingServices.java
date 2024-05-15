package com.vinay.service;

import java.util.List;

import com.vinay.exception.ProductException;
import com.vinay.modal.Rating;
import com.vinay.modal.User;
import com.vinay.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
