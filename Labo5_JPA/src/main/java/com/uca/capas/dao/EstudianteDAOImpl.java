package com.uca.capas.dao;

import java.util.List;

//import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//import org.hibernate.Query;

//import org.postgresql.core.Query;

import org.springframework.dao.DataAccessException;
///import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Estudiante;

@Repository
public class EstudianteDAOImpl implements EstudianteDAO {

	@PersistenceContext (unitName="capas")
	private EntityManager entityManager;
	
	@Override
	public List<Estudiante>findAll()throws DataAccessException{
		StringBuffer sb=new StringBuffer();
		sb.append("select * from public.estudiante");
		Query query =entityManager.createNativeQuery(sb.toString(),Estudiante.class);
		List<Estudiante>resulset=query.getResultList();
		
		return resulset;
	}
	
	@Override
	public Estudiante findOne(Integer code) throws DataAccessException{
		
		Estudiante estudiante = entityManager.find(Estudiante.class, code);
		return estudiante;
	}
	
	
	
}
