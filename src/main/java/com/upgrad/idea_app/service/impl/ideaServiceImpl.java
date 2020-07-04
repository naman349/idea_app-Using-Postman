package com.upgrad.idea_app.service.impl;

import com.upgrad.idea_app.dao.IdeaDAO;
import com.upgrad.idea_app.dto.IdeaDTO;
import com.upgrad.idea_app.service.IdeaService;
import com.upgrad.idea_app.util.IdeaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ideaServiceImpl implements IdeaService {


    @Autowired
    private IdeaDAO ideaDAO;
    @Override
    public void saveIdea(IdeaDTO ideaDTO) {
        ideaDAO.save(IdeaUtils.convertIdeaDTOtoIdeaDO(ideaDTO));

    }

    @Override
    public IdeaDTO getIdea(long id) {
        return IdeaUtils.convertIdeaDOtoIdeaDTO(ideaDAO.find(id));
    }

    @Override
    public List<IdeaDTO> getAllIdea() {
        return ideaDAO.findAll().stream().map(ideaDO->IdeaUtils.convertIdeaDOtoIdeaDTO(ideaDO)).collect(Collectors.toList());
    }

    @Override
    public void updateIdea(IdeaDTO ideaDTO) {
        ideaDAO.update(IdeaUtils.convertIdeaDTOtoIdeaDO(ideaDTO));

    }

    @Override
    public void deleteIdea(long id) {
        ideaDAO.delete(id);
    }
}
