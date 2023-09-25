package com.cibertec.demo.interfacesService;

import java.util.List;
import java.util.Optional;

import com.cibertec.demo.Modelo.Empleado;

public interface InterfaceEmpleadoService {
public List<Empleado>listar();
public Optional<Empleado>listarId(int id);
public int save(Empleado E);
public void delete(int id);


}
