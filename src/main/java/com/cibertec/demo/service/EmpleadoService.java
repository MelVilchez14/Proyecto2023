package com.cibertec.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cibertec.demo.Modelo.Empleado;
import com.cibertec.demo.interfacesService.InterfaceEmpleadoService;

@Service
public class EmpleadoService implements InterfaceEmpleadoService{

	
	private IEmpleado data;
	@Override
	public List<Empleado> listar() {
		return (List<Empleado>)data.findAll();
	}

	@Override
	public Optional<Empleado> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Empleado E) {
int res=0;
Empleado Empleado=data.save(E);
if (!Empleado.equals(null)) {
	res=1;
}

return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
