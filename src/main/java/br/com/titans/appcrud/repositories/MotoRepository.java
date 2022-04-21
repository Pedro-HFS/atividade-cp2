package br.com.titans.appcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.titans.appcrud.model.Moto;

@Repository
public interface MotoRepository extends JpaRepository<Moto, Long> {

}