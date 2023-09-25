package com.cibertec.demo.service;

import java.util.List;

import com.cibertec.demo.Modelo.Empleado;

public interface IEmpleado {

	List<Empleado> findAll();

	Empleado save(Empleado e);

}
