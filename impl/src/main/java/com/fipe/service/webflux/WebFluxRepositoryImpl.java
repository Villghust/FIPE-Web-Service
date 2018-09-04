package com.fipe.service.webflux;

import com.fipe.exception.NotFoundException;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;

import java.util.Optional;

@AllArgsConstructor
public class WebFluxRepositoryImpl implements WebFluxRepository {
    private Scheduler scheduler;

    @Override
    public <T> Mono<T> asyncMono(T callable) {
        return Mono.just(Optional.ofNullable(callable).orElseThrow(() -> new NotFoundException("Veículo não encontrado!")))
                .publishOn(scheduler);
    }

    @Override
    public <T> Flux<T> asyncFlux(Iterable<T> iterable) {
        return Flux.fromIterable(iterable).publishOn(scheduler);
    }
}
