
package com.Tienda.service.impl;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import com.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //Esta etioqueta dice que es la implemetacion de su debido Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired //Sirve para para inyectar idependenciaas y no estar haciendo instancias
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly = true) //Esto hace que sea solo de lectura y no se tenga que bloquear ya que no se hace ninguna transaccion
    public List<Categoria> getCategoria(boolean activos) {
        List<Categoria> categorias= categoriaDao.findAll();
        if(activos){
            categorias.removeIf(c -> !c.isActivo());
        }
        return categorias;
    }

    @Override
    public Categoria getCategoria(Categoria categoria) {
      return categoriaDao.findById(categoria.getIdCategoria()).orElse(null); //En caso de que no encuentre nada retornara un null
    }
     @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
}
}
