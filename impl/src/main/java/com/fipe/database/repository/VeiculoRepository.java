package com.fipe.database.repository;

import com.fipe.database.model.TipoVeiculo;
import com.fipe.database.model.Veiculo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends PagingAndSortingRepository<Veiculo, Long> {
//    @Query(value = "SELECT * FROM veiculos v     " +
//                   "WHERE v.tipo_veiculo = :tipo " +
//                   "AND v.marca = :marca         " +
//                   "AND v.modelo = :modelo       " +
//                   "AND v.ano_modelo = :ano      ", nativeQuery = true);
//    Veiculo getVeiculo(@Param("tipo") TipoVeiculo tipoVeiculo,
//                       @Param("marca") String marca,
//                       @Param("modelo") String modelo,
//                       @Param("ano") int ano);
}