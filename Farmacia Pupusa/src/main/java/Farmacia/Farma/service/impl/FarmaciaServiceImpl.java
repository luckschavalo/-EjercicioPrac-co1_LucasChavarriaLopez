

package Farmacia.Farma.service.impl;


import Farmacia.Farma.dao.FarmaciaDao;
import Farmacia.Farma.domain.Producto;
import Farmacia.Farma.service.FarmaciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FarmaciaServiceImpl extends FarmaciaService {

    @Autowired
    private FarmaciaDao farmaciaDao; 

    @Transactional(readOnly = true)
     static public List<Producto> getProductos(boolean activos) {
        var lista = farmaciaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo()); // Filtrar productos inactivos
        }
        return lista;
    }
}
