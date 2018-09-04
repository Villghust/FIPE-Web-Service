package com.fipe.database.repository;

import com.fipe.database.model.Modelo;
import com.fipe.database.model.TipoVeiculo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloRepository extends PagingAndSortingRepository<Modelo, Long> {
    @Query(value = "SELECT * FROM modelos m      " +
                   "WHERE m.tipo_veiculo = :tipo " +
                   "AND m.marca = :marca         ", nativeQuery = true)
    Modelo getAll(@Param("tipo") TipoVeiculo tipoVeiculo,
                  @Param("marca") String marca);
}