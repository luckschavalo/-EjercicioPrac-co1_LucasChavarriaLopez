

package Farmacia.Farma.controller;

import Farmacia.Farma.service.FarmaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class FarmaciaController {

    @Autowired
    private FarmaciaService farmaciaService; // Se debe inyectar aquí

    @GetMapping("/")
    public String inicio(Model model) {
        var productos = farmaciaService.getProducto(false); // Uso correcto de la instancia
        model.addAttribute("productos", productos);
        model.addAttribute("totalDeProductos", productos.size());
        return "/Producto/listado";
    }

}
