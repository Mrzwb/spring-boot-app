package com.chinauicom.bluesky.repositories;

import com.chinauicom.bluesky.domain.entity.Actor;
import com.chinauicom.bluesky.domain.entity.City;
import com.chinauicom.bluesky.domain.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 自定义仓库
 */
public interface PersonRepository {

    Person findPerson(Person person);
}
