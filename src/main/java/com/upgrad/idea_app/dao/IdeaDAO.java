package com.upgrad.idea_app.dao;




import com.upgrad.idea_app.entity.IdeaDO;

import java.util.List;

public interface IdeaDAO {

    public void save(IdeaDO ideaDO);

    public IdeaDO find(long id);

    public  List<IdeaDO> findAll();

    public  void update(IdeaDO ideaDO);

    public void delete(long id);


}
