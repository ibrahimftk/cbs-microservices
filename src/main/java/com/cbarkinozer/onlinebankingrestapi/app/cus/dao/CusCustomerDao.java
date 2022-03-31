package com.cbarkinozer.onlinebankingrestapi.app.cus.dao;

import com.cbarkinozer.onlinebankingrestapi.app.cus.entity.CusCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CusCustomerDao extends JpaRepository<CusCustomer,Long> {

}
