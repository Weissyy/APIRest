package com.wf3.restapi.model.service;

import java.util.List;

import com.wf3.restapi.model.entity.Produit;
import com.wf3.restapi.model.repository.ProduitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository prodRepo;

    public Produit saveProduit(Produit prod) {
        return prodRepo.save(prod);
    }

    public List<Produit> saveProduits(List<Produit> prods) {
        return (List<Produit>) prodRepo.saveAll(prods);
    }

    public Produit getProduitById(int id) {
        return prodRepo.findById(id).get();
    }

    public List<Produit> getProduits() {
        return (List<Produit>) prodRepo.findAll();
    }

    public List<Produit> getProduitByName(String name) {
        return prodRepo.findByName(name);
    }

    public void deleteProduitById(int id) {
        prodRepo.deleteById(id);
    }

    public Produit updateProduit(Produit prod, int id) {
        Produit ancienProd = getProduitById(id);
        // ancienProd.setId(prod.getId());
        ancienProd.setName(prod.getName());
        ancienProd.setQuantity(prod.getQuantity());
        ancienProd.setPrice(prod.getPrice());
        prodRepo.save(ancienProd);
        return ancienProd;
    }
}
