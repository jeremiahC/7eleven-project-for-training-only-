package com.up.skill.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nxtlvl on 11/16/2016.
 */
@Repository
public interface MyFormRepository extends JpaRepository<MyFormModel, String>{

    List<MyFormModel> findAllById(int id);

    MyFormModel findOneByEmail(String username);
}
