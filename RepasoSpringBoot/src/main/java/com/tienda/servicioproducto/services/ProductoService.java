package com.tienda.servicioproducto.services;

import com.tienda.servicioproducto.model.Producto;
import com.tienda.servicioproducto.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//Esta es la clase que va a llamar al repository para que haga el CRUD
@Transactional
public class ProductoService {

    /***
     * Para que un producto se pueda guardar debe pasar por las siguientes etapas
     * 1- El cliente llena un formulario con la información del producto
     * 2- El controlador captura la información que se envía y genera un llamado al servicio
     * 3- El servicio verifica que los campos estén correctos, que no sea un producto duplicado, que haya productos en stock y lo hace mediante un llamado al repository
     * 4- El repository ejecuta los métodos para devolver la información de la BDD
     * **/
    /*
    @Autowired
    private ProductoRepository productoRepository;*/

    private ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }


    //Método que devuelve un producto por ID
    //Esta función devuelve un Producto y recibe un ID -> La función llama al repository y le indica el ID -> El repository retorna el objeto que consiguión en la BDD que coincide con ese ID
    public Producto findProductoById(Long productoId) {
        return productoRepository.findById(productoId).orElse(null);
    }



}
