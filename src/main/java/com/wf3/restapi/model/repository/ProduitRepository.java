package com.wf3.restapi.model.repository;

import java.util.List;

import com.wf3.restapi.model.entity.Produit;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Integer> {
    public List<Produit> findByName(String name);
}
