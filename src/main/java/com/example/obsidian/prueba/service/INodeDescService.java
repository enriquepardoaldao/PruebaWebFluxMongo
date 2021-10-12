package com.example.obsidian.prueba.service;

import com.example.obsidian.prueba.entity.NodeDesc;
import com.example.obsidian.prueba.entity.NodeRoot;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface INodeDescService {
    Mono<NodeDesc> createNodeDesc(Long id, String name, String descripcion);
    Flux<NodeDesc> findAllNodeDesc(Long idNodeRoot);
}
