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

import com.example.modelo.MonedaPais;
import com.example.repository.MonedaPaisRepository;

@Service
public class MonedaPaisService implements MonedaPaisRepository {
	
	@Autowired
	private MonedaPaisRepository monedaPaisRepository;

	@Override
	public List<MonedaPais> findAll() {
		// TODO Auto-generated method stub
		return monedaPaisRepository.findAll();
	}
	
	public List<MonedaPais> findAllByPais (Long idPais){
		List<MonedaPais> monedaPaisRespuesta = new ArrayList<>();
		List<MonedaPais> monedaPaises = monedaPaisRepository.findAll();
		for (int i=0; i<monedaPaises.size(); i++) {
			if(monedaPaises.get(i).getPais().getIdPais() == idPais) {
				monedaPaisRespuesta.add(monedaPaises.get(i));
			}
		}
		return monedaPaisRespuesta;
	}

	@Override
	public List<MonedaPais> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return monedaPaisRepository.findAll(sort);
	}

	@Override
	public List<MonedaPais> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return monedaPaisRepository.findAllById(ids);
	}

	@Override
	public <S extends MonedaPais> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends MonedaPais> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MonedaPais> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<MonedaPais> entities) {
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
	public MonedaPais getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MonedaPais getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MonedaPais> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MonedaPais> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<MonedaPais> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MonedaPais> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<MonedaPais> findById(Long id) {
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
	public void delete(MonedaPais entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends MonedaPais> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends MonedaPais> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MonedaPais> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MonedaPais> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends MonedaPais> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends MonedaPais, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
