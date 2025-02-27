
package Farmacia.Farma.service;

import Farmacia.Farma.domain.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class FarmaciaService {


    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getProducto(boolean disponibles) {
        if (disponibles) {
            return productoRepository.findByDisponibleTrue();
        } else {
            return productoRepository.findAll();
        }
    }


}
