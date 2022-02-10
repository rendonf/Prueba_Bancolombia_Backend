package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.modelo.GestorMoneda;
import com.example.repository.GestorMonedaRepository;

@Service
public class GestorMonedaService implements GestorMonedaRepository {
	
	@Autowired
	private GestorMonedaRepository gestorMonedaRepository;

	@Override
	public List<GestorMoneda> findAll() {
		// TODO Auto-generated method stub
		return gestorMonedaRepository.findAll();
	}
	
	
	/*public List<GestorMoneda> findAllByGestor (Long idGestor){
		List<GestorMoneda> gestorMonedaRespuesta = new ArrayList<>();
		List<GestorMoneda> gestores = gestorMonedaRepository.findAll();
		for (int i=0; i<gestores.size(); i++) {
			if(gestores.get(i).getGestor().getIdGestor() == idGestor) {
				gestorMonedaRespuesta.add(gestores.get(i));
			}
		}
		return gestorMonedaRespuesta;
	}

	public List<GestorMoneda> findAllByMoneda (Long idMoneda){
		List<GestorMoneda> gestorMonedaRespuesta = new ArrayList<>();
		List<GestorMoneda> gestorMonedas = gestorMonedaRepository.findAll();
		for (int i=0; i<gestorMonedas.size(); i++) {
			if(gestorMonedas.get(i).getMoneda().getIdMoneda() == idMoneda) {
				gestorMonedaRespuesta.add(gestorMonedas.get(i));
			}
		}
		return gestorMonedaRespuesta;
	}*/
	
	@Override
	public List<GestorMoneda> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return gestorMonedaRepository.findAll(sort);
	}

	@Override
	public List<GestorMoneda> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return gestorMonedaRepository.findAllById(ids);
	}

	@Override
	public <S extends GestorMoneda> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends GestorMoneda> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GestorMoneda> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<GestorMoneda> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GestorMoneda getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GestorMoneda getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GestorMoneda> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GestorMoneda> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<GestorMoneda> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GestorMoneda> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<GestorMoneda> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(GestorMoneda entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends GestorMoneda> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends GestorMoneda> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GestorMoneda> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GestorMoneda> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends GestorMoneda> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends GestorMoneda, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
