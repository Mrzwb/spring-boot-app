package com.chinauicom.bluesky.repositories;

import com.chinauicom.bluesky.domain.entity.City;
import com.chinauicom.bluesky.domain.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Person findPerson(Person person) {
        String name = person.getName();
        return (Person) entityManager.createQuery("select u from Person u where u.name=:name ")
                .setParameter("name",name).getSingleResult();

    }

}
