package com.wf3.restapi.controller;

import java.util.List;

import com.wf3.restapi.model.entity.Produit;
import com.wf3.restapi.model.service.ProduitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitController {
    @Autowired
    private ProduitService prodService;

    @PostMapping("/")
    public Produit saveProduitController(@RequestBody Produit prod) {
        return prodService.saveProduit(prod);
    }

    @PostMapping("/some")
    public List<Produit> saveProduitsController(@RequestBody List<Produit> prods) {
        return prodService.saveProduits(prods);
    }

    @GetMapping("/produit/{id}")
    public Produit getProduitByIdController(@PathVariable int id) {
        return prodService.getProduitById(id);
    }

    @GetMapping("/")
    public List<Produit> getProduitsController() {
        return prodService.getProduits();
    }

    @GetMapping("/{name}")
    public List<Produit> getProduitByNameController(@PathVariable String name) {
        return prodService.getProduitByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteProduitByIdController(@PathVariable int id) {
        prodService.deleteProduitById(id);
    }

    @PutMapping("/{id}")
    public Produit updateProduitController(@RequestBody Produit prod, @PathVariable int id) {
        return prodService.updateProduit(prod, id);
    }
}
