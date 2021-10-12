package com.example.obsidian.prueba.repository;

import com.example.obsidian.prueba.entity.NodeDesc;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface INodeDescRepository extends ReactiveSortingRepository<NodeDesc, Long> {
}
