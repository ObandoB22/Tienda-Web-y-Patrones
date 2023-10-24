
package com.Tienda.service;


import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //RETRONA UNA LISTA DE CATEGORIAS YA SEA TODAS O SOLO LAS ACTIVAS
    public List<Categoria> getCategoria(boolean activos);
    //RETORNA UNA CATEGORIA POR SU ID
    public Categoria getCategoria(Categoria categoria);
    
    //INSERTA UN NUEVO REGISTRO SI EL ID DE LA ESTA VACIO
    //SE ACTUALIZA EL REGISTRO DEL ID DE LA CATEGORIA SI NO ESTA VACIO
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);
}
