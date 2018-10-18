package com.example.demo.domain.repository;

import com.example.demo.domain.entity.DomainEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface EntityRepository<T extends DomainEntity, Integer> extends CrudRepository<T, Integer> {

    List<T> findAll();
    Optional<T> findById(Integer id);


}
