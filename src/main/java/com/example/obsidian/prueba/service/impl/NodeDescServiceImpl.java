package com.example.obsidian.prueba.service.impl;

import com.example.obsidian.prueba.entity.NodeDesc;
import com.example.obsidian.prueba.repository.INodeDescRepository;
import com.example.obsidian.prueba.repository.INodeRootRepository;
import com.example.obsidian.prueba.service.INodeDescService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class NodeDescServiceImpl implements INodeDescService {

    @Autowired
    INodeDescRepository nodeDescRepository;


    @Override
    public Mono<NodeDesc> createNodeDesc(Long id, String name, String descripcion) {

        NodeDesc nd = new NodeDesc(id, name, descripcion);
        return nodeDescRepository.save(nd);

    }

    @Override
    public Flux<NodeDesc> findAllNodeDesc(Long idNodeRoot) {

        return nodeDescRepository.findAll();
    }
}
