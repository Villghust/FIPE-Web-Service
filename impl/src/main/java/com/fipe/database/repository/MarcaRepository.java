package com.fipe.database.repository;

import com.fipe.database.model.Marca;
import com.fipe.database.model.TipoVeiculo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends PagingAndSortingRepository<Marca, Long> {
    @Query(value = "SELECT * FROM marcas m       " +
                   "WHERE m.tipo_veiculo = :tipo ", nativeQuery = true)
    Marca getAll(@Param("tipo") TipoVeiculo tipoVeiculo);
}