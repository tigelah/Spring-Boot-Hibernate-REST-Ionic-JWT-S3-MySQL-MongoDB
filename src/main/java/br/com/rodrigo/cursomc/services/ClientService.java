package br.com.rodrigo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rodrigo.cursomc.domain.Client;
import br.com.rodrigo.cursomc.repositories.ClientRepository;
import br.com.rodrigo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public Client get(Integer id) {
		
		Optional<Client> obj = clientRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found: Id: " + id + ", Tipo: " + Client.class.getName()));
	}
}
