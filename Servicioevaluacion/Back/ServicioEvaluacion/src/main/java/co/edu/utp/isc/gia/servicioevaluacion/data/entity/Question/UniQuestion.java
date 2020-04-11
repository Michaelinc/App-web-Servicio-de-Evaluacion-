/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.data.entity.Question;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Option;
import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Question.QuestionType;
import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Solution;
import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Test;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Michael
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "UNIQUESTION")
@EqualsAndHashCode(callSuper = false)
public class UniQuestion extends QuestionType implements Serializable{
    
    @Id
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Option> option;
    @OneToOne
    private Option correctAnswer;
    @ManyToOne
    private Solution solution;
    
}
