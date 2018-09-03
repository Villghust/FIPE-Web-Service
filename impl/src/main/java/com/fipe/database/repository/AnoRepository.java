package com.fipe.database.repository;

import com.fipe.database.model.Ano;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnoRepository extends PagingAndSortingRepository<Ano, Long> {
}

// TODO 10