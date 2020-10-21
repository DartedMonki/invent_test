package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdukService {
	
	@Autowired
	private ProdukRepository repo;
	
	public List<Produk> listAll() {
		return repo.findAll();
	}
	
	public void save(Produk produk) {
		repo.save(produk);
	}
	
	public Produk get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
