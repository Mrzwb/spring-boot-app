package com.chinauicom.bluesky.service;

import com.chinauicom.bluesky.domain.entity.Actor;
import com.chinauicom.bluesky.domain.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IService {

    Page<Actor> findAll(Pageable pageable);

    Page<Person> findPersonList(Pageable pageable);

    Person findPerson(Person person);

}
