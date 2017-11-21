package com.chinauicom.bluesky.repositories;

import com.chinauicom.bluesky.domain.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * MongoDB 仓库
 */
public interface PersonMgRepository extends MongoRepository<Person,String> {

}
