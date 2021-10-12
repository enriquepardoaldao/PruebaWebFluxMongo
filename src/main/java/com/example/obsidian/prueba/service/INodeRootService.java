package com.example.obsidian.prueba.service;

import com.example.obsidian.prueba.entity.NodeRoot;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface INodeRootService {
    Mono<NodeRoot> createNodeRoot(Long id, String name);
    Flux<NodeRoot> findAllNodeRoot(Long idNodeRoot);
}
