package com.example.obsidian.prueba.repository;

import com.example.obsidian.prueba.entity.NodeRoot;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface INodeRootRepository extends ReactiveSortingRepository<NodeRoot, Long> {
}
