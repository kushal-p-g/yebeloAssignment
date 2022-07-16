package com.yebelo.assign.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CatAndValueRepository extends JpaRepository<CatAndValue, Integer> {
 List<CatAndValue> findByCategoryCode(String cat);
}
