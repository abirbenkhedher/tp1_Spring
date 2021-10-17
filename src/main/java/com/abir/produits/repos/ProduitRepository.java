package com.abir.produits.repos;

import org.springframework.data.repository.JpaRepository;
import com.abir.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

	
}
