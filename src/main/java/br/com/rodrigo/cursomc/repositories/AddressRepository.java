package br.com.rodrigo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rodrigo.cursomc.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
