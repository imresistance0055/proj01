package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entity.Army;

@Repository
public interface ArmyRepository extends JpaRepository<Army, String> {

}
