package com.jpmc.application.Services;
import com.jpmc.application.Entity.Studente;

import java.util.List;
import java.util.Optional;
public interface Sservice
 {
    public void save(Studente latStudent);

    public Optional<Studente> getStudentById(int id);

    public List<Studente> getStudents(Integer pageNo, Integer pageSize, String sortBy);

    
}
