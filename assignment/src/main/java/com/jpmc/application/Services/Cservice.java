package com.jpmc.application.Services;
import java.util.List;

import com.jpmc.application.Entity.ECourse;
public interface Cservice 
{
    public void save(ECourse course);
     public List<ECourse> getCourses();

    
}
