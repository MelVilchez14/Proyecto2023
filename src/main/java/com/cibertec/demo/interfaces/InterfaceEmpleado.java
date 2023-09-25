package com.cibertec.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.demo.Modelo.Empleado;

@Repository
public interface InterfaceEmpleado extends CrudRepository<Empleado, Integer>{

}
