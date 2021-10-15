package com.example.simmanagerv2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.hibernate.annotations.CreationTimestamp;
//
//import javax.persistence.*;
import java.util.Date;

//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SimMovements {
//    @Id
//    @GeneratedValue
    private long id;
    private int port;
//    @CreationTimestamp
    private Date date;

//    @ManyToOne
//    @JoinColumn(name = "id_sim_fk")
    private Sim sim;

//    @ManyToOne
//    @JoinColumn(name = "id_modem_fk")
    private Modem modem;


}
