package br.com.rodrigo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rodrigo.cursomc.domain.Estate;


@Repository
public interface EstateRepository  extends JpaRepository<Estate, Integer> {

}
