/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.co.mfernando.vagaemprego.service;

import ao.co.mfernando.vagaemprego.domain.Curso;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author mfernando
 */

public interface CursoService {
    List<Curso> findAll();    
}
