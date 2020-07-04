package com.upgrad.idea_app.util;


import com.upgrad.idea_app.dto.IdeaDTO;
import com.upgrad.idea_app.entity.IdeaDO;

public class IdeaUtils {


    private IdeaUtils(){}



    public static IdeaDO convertIdeaDTOtoIdeaDO(IdeaDTO ideaDTO){
        IdeaDO ideaDO=new IdeaDO();
        ideaDO.setId(ideaDTO.getId());
        ideaDO.setIdeaDescription(ideaDTO.getIdeaDescription());
        ideaDO.setIdeaDescription(ideaDTO.getIdeaName());
        return ideaDO;


    }

    public static IdeaDTO convertIdeaDOtoIdeaDTO(IdeaDO ideaDO){
        IdeaDTO ideaDTO=new IdeaDTO();
        ideaDTO.setId(ideaDO.getId());
        ideaDTO.setIdeaDescription(ideaDO.getIdeaDescription());
        ideaDTO.setIdeaDescription(ideaDO.getIdeaName());
        return ideaDTO;


    }




}
