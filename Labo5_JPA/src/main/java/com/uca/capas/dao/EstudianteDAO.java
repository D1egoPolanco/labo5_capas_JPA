package com.uca.capas.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;
import com.uca.capas.domain.*;

public interface EstudianteDAO {
	
	public List<Estudiante>findAll() throws DataAccessException;
	 
	public Estudiante findOne (Integer code) throws  DataAccessException;

}
