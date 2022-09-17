/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.co.mfernando.vagaemprego.controller;

import ao.co.mfernando.vagaemprego.domain.Curso;
import ao.co.mfernando.vagaemprego.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mfernando
 */
@RestController
@RequestMapping("api/v1/cursos")
public class CursoController {
    private CursoService cursoService;
    @Autowired
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }
    
    @GetMapping
    public List<Curso> findAll(){
        return cursoService.findAll();
    }
    
}
