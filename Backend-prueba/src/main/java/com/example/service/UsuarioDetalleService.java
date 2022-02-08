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

import com.example.modelo.UsuarioDetalle;
import com.example.repository.UsuarioDetalleRepository;

@Service
public class UsuarioDetalleService implements UsuarioDetalleRepository {
	
	@Autowired
	private UsuarioDetalleRepository usuarioDetalleRepository;

	@Override
	public List<UsuarioDetalle> findAll() {
		// TODO Auto-generated method stub
		return usuarioDetalleRepository.findAll();
	}
	
	public List<UsuarioDetalle> findAllByUsuario (Long idUsuario){
		List<UsuarioDetalle> usuarioDetalleRespuesta = new ArrayList<>();
		List<UsuarioDetalle> usuarioDetalles = usuarioDetalleRepository.findAll();
		for (int i=0; i<usuarioDetalles.size(); i++) {
			if(usuarioDetalles.get(i).getUsuario().getIdUsuario() == idUsuario) {
				usuarioDetalleRespuesta.add(usuarioDetalles.get(i));
			}
		}
		return usuarioDetalleRespuesta;
	}
	
	public List<UsuarioDetalle> findAllByMoneda (Long id){
		List<UsuarioDetalle> usuarioDetalleRespuesta = new ArrayList<>();
		List<UsuarioDetalle> usuarioDetalles = usuarioDetalleRepository.findAll();
		for (int i=0; i<usuarioDetalles.size(); i++) {
			if(usuarioDetalles.get(i).getMoneda().getId() == id) {
				usuarioDetalleRespuesta.add(usuarioDetalles.get(i));
			}
		}
		return usuarioDetalleRespuesta;
	}
	
	public List<UsuarioDetalle> findAllByGestor(Long id){
		List<UsuarioDetalle> usuarioDetalleRespuesta =new ArrayList<>();
		List<UsuarioDetalle> usuarioDetalles = usuarioDetalleRepository.findAll();
		for (int i=0; i<usuarioDetalles.size(); i++) {
			if(usuarioDetalles.get(i).getGestor().getId() == id) {
				usuarioDetalleRespuesta.add(usuarioDetalles.get(i));
			}
		}
		return usuarioDetalleRespuesta;
	}

	@Override
	public List<UsuarioDetalle> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return usuarioDetalleRepository.findAll(sort);
	}

	@Override
	public List<UsuarioDetalle> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return  usuarioDetalleRepository.findAllById(ids);
	}

	@Override
	public <S extends UsuarioDetalle> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends UsuarioDetalle> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UsuarioDetalle> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<UsuarioDetalle> entities) {
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
	public UsuarioDetalle getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDetalle getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UsuarioDetalle> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UsuarioDetalle> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<UsuarioDetalle> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UsuarioDetalle> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UsuarioDetalle> findById(Long id) {
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
	public void delete(UsuarioDetalle entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends UsuarioDetalle> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends UsuarioDetalle> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UsuarioDetalle> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UsuarioDetalle> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends UsuarioDetalle> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends UsuarioDetalle, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
