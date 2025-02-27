

package Farmacia.Farma.dao;

import Farmacia.Farma.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FarmaciaDao extends JpaRepository<Producto, Long> {

}
