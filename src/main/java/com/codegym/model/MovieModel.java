package com.codegym.model;

import com.codegym.entity.BaseEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MovieModel  extends BaseEntity implements Serializable {
    private String title;
    private String country;
    private int year;
    private List<CategoryMovieModel> categoryMovieModels = new ArrayList<>();
    private String description;
    private String youtubeTrailer;
    private String imagePath;
    private List<ReviewModel> reviews = new ArrayList<>();
    private String rating;

    public MovieModel(String title, String country, int year, List<CategoryMovieModel> categoryMovieModels, String description, String youtubeTrailer, String imagePath, List<ReviewModel> reviews, String rating) {
        this.title = title;
        this.country = country;
        this.year = year;
        this.categoryMovieModels = categoryMovieModels;
        this.description = description;
        this.youtubeTrailer = youtubeTrailer;
        this.imagePath = imagePath;
        this.reviews = reviews;
        this.rating = rating;
    }

    public MovieModel(Integer id, String title, String country, int year, List<CategoryMovieModel> categoryMovieModels, String description, String youtubeTrailer, String imagePath, List<ReviewModel> reviews, String rating) {
        super(id);
        this.title = title;
        this.country = country;
        this.year = year;
        this.categoryMovieModels = categoryMovieModels;
        this.description = description;
        this.youtubeTrailer = youtubeTrailer;
        this.imagePath = imagePath;
        this.reviews = reviews;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<CategoryMovieModel> getCategoryMovieModels() {
        return categoryMovieModels;
    }

    public void setCategoryMovieModels(List<CategoryMovieModel> categoryMovieModels) {
        this.categoryMovieModels = categoryMovieModels;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYoutubeTrailer() {
        return youtubeTrailer;
    }

    public void setYoutubeTrailer(String youtubeTrailer) {
        this.youtubeTrailer = youtubeTrailer;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public List<ReviewModel> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewModel> reviews) {
        this.reviews = reviews;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return new StringBuffer().append("Movie{")
                .append("title='").append(title).append('\'')
                .append(", country='").append(country).append('\'')
                .append(", year=").append(year)
                .append(", movieType=").append(categoryMovieModels)
                .append(", youtubeTrailer='").append(youtubeTrailer).append('\'')
                .append(", imagePath='").append(imagePath).append('\'')
                .append('}').toString();
    }
}
