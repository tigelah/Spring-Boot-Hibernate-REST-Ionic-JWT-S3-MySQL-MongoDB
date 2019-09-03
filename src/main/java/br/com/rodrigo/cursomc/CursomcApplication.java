package br.com.rodrigo.cursomc;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rodrigo.cursomc.domain.Address;
import br.com.rodrigo.cursomc.domain.Category;
import br.com.rodrigo.cursomc.domain.City;
import br.com.rodrigo.cursomc.domain.Client;
import br.com.rodrigo.cursomc.domain.Estate;
import br.com.rodrigo.cursomc.domain.Product;
import br.com.rodrigo.cursomc.domain.enums.TypeClient;
import br.com.rodrigo.cursomc.repositories.AddressRepository;
import br.com.rodrigo.cursomc.repositories.CategoryRepository;
import br.com.rodrigo.cursomc.repositories.CityRepository;
import br.com.rodrigo.cursomc.repositories.ClientRepository;
import br.com.rodrigo.cursomc.repositories.EstateRepository;
import br.com.rodrigo.cursomc.repositories.ProductRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private EstateRepository estateRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private AddressRepository addressRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		Category cat1 = new Category(null,"Informática");
		Category cat2 = new Category(null,"Escritório");
		
		Product p1 = new Product(null, "Computador", 2000.00);
		Product p2 = new Product(null, "Impressora", 800.00);
		Product p3 = new Product(null, "Mouse", 80.00);

		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProducts().addAll(Arrays.asList(p2));

		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));

		
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		
		Estate est1 = new Estate(null, "Minas Gerais");
		Estate est2 = new Estate(null, "São Paulo");

		City c1 = new City(null, "Uberlândia", est1);
		City c2 = new City(null, "São Paulo", est2);
		City c3 = new City(null, "Campinas", est2);

		est1.getCities().addAll(Arrays.asList(c1));
		est2.getCities().addAll(Arrays.asList(c2, c3));

		estateRepository.saveAll(Arrays.asList(est1, est2));
		cityRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Client cli1 = new Client(null, "Juliana", "juju@gmail.com", "36378912377", TypeClient.PESSOAFISICA);

		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));

		Address e1 = new Address(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, c1);
		Address e2 = new Address(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);

		cli1.getAddress().addAll(Arrays.asList(e1, e2));

		clientRepository.saveAll(Arrays.asList(cli1));
		addressRepository.saveAll(Arrays.asList(e1, e2));
	}

}
