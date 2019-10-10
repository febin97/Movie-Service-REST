package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    private @Id Integer movieId;
    private String imdbId;
    private int movieBudget;
    private String movieLanguage;
    private String movieTitle;
    private String moviePosterPath;
    private int movieRevenue;
    private int movieRunTime;
    private String movieReleaseDate;
    private String movieOverview;
    private String movieTagLine;
}
