package com.tmm.nosql.neo4j.repo;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.tmm.nosql.neo4j.domain.nodes.Award;

/**
 * Repository class to persist Award objects - this is the DAO object layer
 * 
 * @author robert.hinds
 * 
 */
public interface AwardRepository extends GraphRepository<Award> {

}