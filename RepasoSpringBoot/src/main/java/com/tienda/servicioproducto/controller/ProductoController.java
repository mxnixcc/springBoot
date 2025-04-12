package com.tienda.servicioproducto.controller;

import com.tienda.servicioproducto.model.Producto;
import com.tienda.servicioproducto.services.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/unico")
    public String mostrarInformacionProducto(@RequestParam("id_producto") Long id) {
        //Esta función devuelve un String -> Se le pasa el id al servicio -> el servicio le pasa el id al repository -> el repository busca el producto
        //El repository devuelve el objeto que encontró -> Se lo pasa al servicio -> el servicio se lo pasa al controlador
        Producto productoSeleccionado = productoService.findProductoById(id);
        return productoSeleccionado.getNombre();
    }

}
