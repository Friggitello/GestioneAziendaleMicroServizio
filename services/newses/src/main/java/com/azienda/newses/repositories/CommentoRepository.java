package com.azienda.newses.repositories;


import com.azienda.newses.entities.Commento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentoRepository extends JpaRepository<Commento,Long> {
}
