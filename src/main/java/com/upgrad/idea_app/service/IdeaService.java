package com.upgrad.idea_app.service;

import com.upgrad.idea_app.dto.IdeaDTO;

import java.util.List;

public interface IdeaService {

    public void saveIdea(IdeaDTO ideadDTO);

    public  IdeaDTO getIdea(long id);

   // public List<IdeaDTO> getALLIdea();

    public void updateIdea(IdeaDTO ideaDTO);

    public  void deleteIdea(long id);


    public List<IdeaDTO> getAllIdea();
}
