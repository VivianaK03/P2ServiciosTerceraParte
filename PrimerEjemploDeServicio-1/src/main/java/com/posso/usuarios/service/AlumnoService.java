package com.posso.usuarios.service;


import com.posso.commons.service.CommonService;
import com.posso.usuarios.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno> {

    public Alumno save(Alumno alumno);

    public void deleteById (Long id);
}

