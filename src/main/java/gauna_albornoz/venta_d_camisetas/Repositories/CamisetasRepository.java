package gauna_albornoz.venta_d_camisetas.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gauna_albornoz.venta_d_camisetas.Models.Camisetas;


@Repository
public interface CamisetasRepository extends CrudRepository<Camisetas, Long> {
}
