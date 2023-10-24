//ESTA CLASE VA A MAPEAR UNA TABLA DE LA BASE DE DATOS
package com.Tienda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data //Nos facilitara el desarrollo de entidades creando los sets y los gets automaticamente
@Entity //Esta anotacion dira que esta clase se manejara como una entidad
@Table(name="categoria")  //Le dice hibernate que el mapeo lo hara a la tabla especificada
public class Categoria implements Serializable {
    
    private static final long serialVersionUID=1L;
    
    @Id // LO IDENTIFICA COMO UN ID
    @GeneratedValue(strategy=GenerationType.IDENTITY) //LO HACE AUTO INCREMENTAL
    private Long idCategoria; //Hibernate transformara esto en id_categoria
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    public Categoria(){}

    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
    
    
}
