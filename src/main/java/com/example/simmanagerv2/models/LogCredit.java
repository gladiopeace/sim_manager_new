package com.example.simmanagerv2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import javax.persistence.*;
import java.util.Date;

//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LogCredit {

//    @Id
//    @GeneratedValue
    private long id;
    private Date date;
    private double simCredit;
    private double systemCredit;

//    @ManyToOne
//    @JoinColumn(name = "id_sim_fk")
    private Sim sim;

}
