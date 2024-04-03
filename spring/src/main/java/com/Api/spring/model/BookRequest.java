package com.Api.spring.model;







import javax.validation.constraints.NotBlank;

public class BookRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}