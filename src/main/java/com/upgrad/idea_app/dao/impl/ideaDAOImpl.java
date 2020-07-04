package com.upgrad.idea_app.dao.impl;

import com.upgrad.idea_app.dao.IdeaDAO;
import com.upgrad.idea_app.entity.IdeaDO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ideaDAOImpl implements IdeaDAO {

    private  static final Map<Long,IdeaDO> IDEA_STORE=new HashMap<>();

    @Override
    public void save(IdeaDO ideaDO) {
        IDEA_STORE.put(ideaDO.getId(),ideaDO);

    }

    @Override
    public IdeaDO find(long id) {
        return IDEA_STORE.get(id);
    }

    @Override
    public List<IdeaDO> findAll() {
        return IDEA_STORE.values().stream().collect(Collectors.toList());
    }

    @Override
    public void update(IdeaDO ideaDO) {
    IDEA_STORE.put(ideaDO.getId(),ideaDO);
    }

    @Override
    public void delete(long id) {
        IDEA_STORE.remove(id);
    }
}
