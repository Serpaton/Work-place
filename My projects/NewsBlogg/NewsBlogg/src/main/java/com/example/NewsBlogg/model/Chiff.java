package com.example.NewsBlogg.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Chiff {
	
	private Source Source;

    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;
    
}
