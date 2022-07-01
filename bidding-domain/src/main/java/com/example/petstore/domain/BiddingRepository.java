package com.example.petstore.domain;

import com.example.petstore.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "biddings", path = "biddings")
public interface BiddingRepository
    extends PagingAndSortingRepository<Bidding, Long> {}
