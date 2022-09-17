/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.co.mfernando.vagaemprego.repository;

import ao.co.mfernando.vagaemprego.domain.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mfernando
 */
@Repository
public interface CursoRepository extends JpaRepository<Curso, String>{
    
}
