package dev.md.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.md.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
