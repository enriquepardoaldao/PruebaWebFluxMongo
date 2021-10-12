package com.example.obsidian.prueba.service.impl;

import com.example.obsidian.prueba.entity.NodeRoot;
import com.example.obsidian.prueba.repository.INodeRootRepository;
import com.example.obsidian.prueba.service.INodeRootService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class NodeRootServiceImpl implements INodeRootService {

    @Autowired
    INodeRootRepository nodeRootRepository;

    @Override
    public Mono<NodeRoot> createNodeRoot(Long id, String name) {
        NodeRoot nr = new NodeRoot(id, name);
        return nodeRootRepository.save(nr);
    }

    @Override
    public Flux<NodeRoot> findAllNodeRoot(Long idNodeRoot) {
        return nodeRootRepository.findAll();

    }
}
