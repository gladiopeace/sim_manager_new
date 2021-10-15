package com.example.simmanagerv2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
import java.util.List;


//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SimType {
//    @Id
//    @GeneratedValue
    private long id;
    private String type;
    private int flag;

//    @OneToMany(mappedBy = "simType")
    private List<Sim> sims;
}
