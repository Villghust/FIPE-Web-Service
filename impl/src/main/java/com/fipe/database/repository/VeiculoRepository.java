package com.fipe.database.repository;

import com.fipe.database.model.Veiculo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends PagingAndSortingRepository<Veiculo, Long> {

}