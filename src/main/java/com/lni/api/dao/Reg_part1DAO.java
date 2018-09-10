package com.lni.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lni.api.dto.Reg_part1;


@Repository("reg_part1DAO")
public interface Reg_part1DAO extends CrudRepository<Reg_part1, Integer> {

}
