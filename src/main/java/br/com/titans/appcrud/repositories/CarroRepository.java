package br.com.titans.appcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.titans.appcrud.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}
