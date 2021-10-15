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
public class Modem {
//    @Id
//    @GeneratedValue
    private long id;
    private String ip;
    private int port;
    private String user;
    private String password;
    private String name;
    private String description;
    private String systemId;
    private int flag;

//    @OneToMany(mappedBy = "modem")
    private List<SimMovements> movements;

    public String getPortsUrl(){
        return  "http://"+ip+"/goip_send_at.html?username="+user+"&password="+password;
    }

    public String getCIMIUrl(int port){
        return  "http://"+ip+"/goip_send_at.html?username="+user+"&password="+password+"&port="+port+"&at=AT%2BCIMI&timeout=50";
    }

    public String getOperatorUrl(int port){
        return  "http://"+ip+"/goip_send_at.html?username="+user+"&password="+password+"&port="+port+"&at=AT%2BCIMI&timeout=50";
    }


}
