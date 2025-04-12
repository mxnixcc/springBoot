package com.tienda.servicioproducto.repository;

import com.tienda.servicioproducto.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    //Ya con extender de JpaRepository tengo acceso a todo el CRUD

}
