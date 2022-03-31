package com.cbarkinozer.onlinebankingrestapi.app.cus.entity;

import com.cbarkinozer.onlinebankingrestapi.app.gen.entity.BaseEntity;
import com.cbarkinozer.onlinebankingrestapi.app.gen.enums.GenStatusType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="CUS_CUSTOMER")
public class CusCustomer extends BaseEntity {
    @Id
    @SequenceGenerator(name = "CusCustomer" , sequenceName = "CUS_CUSTOMER_ID_SEQ")
    @GeneratedValue(generator = "CusCustomer")
    private Long id;

    @Column(name="NAME",length=100, nullable = false)
    private String name;

    @Column(name="SURNAME",length=100, nullable = false)
    private String surname;

    @Column(name="IDENTITY_NO",length=15,nullable = false,unique = true)
    private Long identityNo;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

}