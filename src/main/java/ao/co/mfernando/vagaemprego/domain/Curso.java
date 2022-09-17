/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.co.mfernando.vagaemprego.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author mfernando
 */
@Data
@Entity
@Table(name = "curso")
public class Curso implements Serializable{
    @Id
    private String id;
    private String designacao;
}
