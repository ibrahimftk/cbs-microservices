package com.cbarkinozer.onlinebankingrestapi.app.cus.dto;

import lombok.Data;

@Data
public class CusCustomerSaveDto {

    private String name;
    private String surname;
    private Long identityNo;
    private String password;

}
