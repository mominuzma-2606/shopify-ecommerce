package com.vinay.service;

import java.util.List;

import com.vinay.exception.ProductException;
import com.vinay.modal.Review;
import com.vinay.modal.User;
import com.vinay.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
