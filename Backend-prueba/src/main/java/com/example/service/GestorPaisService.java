package com.example.service;

import java.util.ArrayList;
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

import com.example.modelo.GestorPais;
import com.example.repository.GestorPaisRepository;

@Service
public class GestorPaisService implements GestorPaisRepository {
	
	@Autowired
	private GestorPaisRepository gestorPaisRepository;

	@Override
	public List<GestorPais> findAll() {
		// TODO Auto-generated method stub
		return gestorPaisRepository.findAll();
	}

	public List<GestorPais> findAllByPais (Long idPais){
		List<GestorPais> gestorPaisRespuesta = new ArrayList<>();
		List<GestorPais> gestorPaises = gestorPaisRepository.findAll();
		for (int i=0; i<gestorPaises.size(); i++) {
			if(gestorPaises.get(i).getPais().getIdPais() == idPais) {
				gestorPaisRespuesta.add(gestorPaises.get(i));
			}
		}
		return gestorPaisRespuesta;
	}
	
	@Override
	public List<GestorPais> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return gestorPaisRepository.findAll(sort);
	}

	@Override
	public List<GestorPais> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return gestorPaisRepository.findAllById(ids);
	}

	@Override
	public <S extends GestorPais> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends GestorPais> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GestorPais> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<GestorPais> entities) {
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
	public GestorPais getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GestorPais getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GestorPais> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GestorPais> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<GestorPais> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GestorPais> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<GestorPais> findById(Long id) {
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
	public void delete(GestorPais entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends GestorPais> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends GestorPais> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GestorPais> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GestorPais> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends GestorPais> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends GestorPais, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
