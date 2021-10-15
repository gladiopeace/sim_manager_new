package com.example.simmanagerv2.dtos;

import lombok.Data;

@Data
public class ModemResponse {
    private String code;
    private String reason;
    private String resp;
}
