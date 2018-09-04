package com.fipe.service.webflux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WebFluxRepository {
    <T> Mono<T> asyncMono(T callable);

    <T> Flux<T> asyncFlux(Iterable<T> callable);
}