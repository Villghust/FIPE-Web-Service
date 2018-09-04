package com.fipe.database.repository;

import com.fipe.database.model.Ano;
import com.fipe.database.model.TipoVeiculo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnoRepository extends PagingAndSortingRepository<Ano, Long> {
    @Query(value = "SELECT * FROM anos a         " +
                   "WHERE a.tipo_veiculo = :tipo " +
                   "AND a.marca = :marca         " +
                   "AND a.modelo = :modelo       ", nativeQuery = true)
    Ano getAll(@Param("tipo")TipoVeiculo tipoVeiculo,
               @Param("marca") String marca,
               @Param("modelo") String modelo);
}