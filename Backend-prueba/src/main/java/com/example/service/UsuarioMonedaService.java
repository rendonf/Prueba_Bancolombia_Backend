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

import com.example.modelo.UsuarioMoneda;
import com.example.repository.UsuarioMonedaRepository;

@Service
public class UsuarioMonedaService implements UsuarioMonedaRepository {
	
	@Autowired
	private UsuarioMonedaRepository usuarioMonedaRepository;

	@Override
	public List<UsuarioMoneda> findAll() {
		// TODO Auto-generated method stub
		return usuarioMonedaRepository.findAll();
	}


	public List<UsuarioMoneda> findAllByUsuario (Long idUsuario){
		List<UsuarioMoneda> usuarioDetalleRespuesta = new ArrayList<>();
		List<UsuarioMoneda> usuarioMonedas = usuarioMonedaRepository.findAll();
		for (int i=0; i<usuarioMonedas.size(); i++) {
			if(usuarioMonedas.get(i).getUsuario().getIdUsuario() == idUsuario) {
				usuarioDetalleRespuesta.add(usuarioMonedas.get(i));
			}
		}
		return usuarioDetalleRespuesta;
	}
	
	public List<UsuarioMoneda> findAllByMoneda (Long id){
		List<UsuarioMoneda> usuarioMonedaRespuesta = new ArrayList<>();
		List<UsuarioMoneda> usuarioMonedas = usuarioMonedaRepository.findAll();
		for (int i=0; i<usuarioMonedas.size(); i++) {
			if(usuarioMonedas.get(i).getMoneda().getId() == id) {
				usuarioMonedaRespuesta.add(usuarioMonedas.get(i));
			}
		}
		return usuarioMonedaRespuesta;
	}

	@Override
	public List<UsuarioMoneda> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return usuarioMonedaRepository.findAll(sort);
	}

	@Override
	public List<UsuarioMoneda> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return  usuarioMonedaRepository.findAllById(ids);
	}

	@Override
	public <S extends UsuarioMoneda> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends UsuarioMoneda> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UsuarioMoneda> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<UsuarioMoneda> entities) {
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
	public UsuarioMoneda getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioMoneda getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UsuarioMoneda> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UsuarioMoneda> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<UsuarioMoneda> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UsuarioMoneda> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UsuarioMoneda> findById(Long id) {
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
	public void delete(UsuarioMoneda entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends UsuarioMoneda> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends UsuarioMoneda> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UsuarioMoneda> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UsuarioMoneda> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends UsuarioMoneda> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends UsuarioMoneda, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
