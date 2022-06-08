package com.jpmc.application.Repository;
import javax.transaction.Transactional;

import com.jpmc.application.Entity.Studente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public interface SRepository extends JpaRepository<Studente,Integer>
{

    
}
