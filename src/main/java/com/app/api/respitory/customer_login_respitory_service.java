package com.app.api.respitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.api.Entity.ServicePlan;

import java.util.List;


public interface customer_login_respitory_service extends JpaRepository<ServicePlan, Long> {

    List<ServicePlan> findByClientId(Long clientId);

}
