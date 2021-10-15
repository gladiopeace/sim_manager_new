package com.example.simmanagerv2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import javax.persistence.*;
import java.util.List;

//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sim {

//    @Id
//    @GeneratedValue
    private long id;
    private String number;
    private String cimi;
    private double credit;
    private int pin;
    private int flag;


//    @OneToMany(mappedBy = "sim")
    private List<LogCredit> logCredits;

//    @ManyToOne
//    @JoinColumn(name = "id_operator_fk")
    private Operator operator;

//    @ManyToOne
//    @JoinColumn(name = "id_sim_type_fk")
    private SimType simType;

//    @OneToMany(mappedBy = "sim")
    private List<SimMovements> movements;

}
