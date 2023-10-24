package com.Tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
//TODOS ESTOS DATOS ESTAN EN NUESTRA CONFIOGURACION DE FIREBASE
    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-f1426.appspot.com";  

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-f1426-firebase-adminsdk-tgz9m-4e933aaa01.json";
}


