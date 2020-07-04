package com.upgrad.idea_app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

//
public class IdeaDTO {

    @JsonProperty("id")
    private long id;

    @JsonProperty("idea_name")
    private String ideaName;
    @JsonProperty("author_name")
    private String authorName;

    @JsonProperty("idea_description")
    private String ideaDescription;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdeaName() {
        return ideaName;
    }

    public void setIdeaName(String ideaName) {
        this.ideaName = ideaName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIdeaDescription() {
        return ideaDescription;
    }

    public void setIdeaDescription(String ideaDescription) {
        this.ideaDescription = ideaDescription;
    }
}
