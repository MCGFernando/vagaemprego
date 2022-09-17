/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.co.mfernando.vagaemprego.service.impl;

import ao.co.mfernando.vagaemprego.domain.Curso;
import ao.co.mfernando.vagaemprego.repository.CursoRepository;
import ao.co.mfernando.vagaemprego.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mfernando
 */
@Service
public class CursoServiceImpl implements CursoService {

    private CursoRepository cursoRepository;
    
    @Autowired
    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

}
