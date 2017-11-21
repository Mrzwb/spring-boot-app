package com.chinauicom.bluesky.repositories;

import com.chinauicom.bluesky.domain.entity.Actor;
import com.chinauicom.bluesky.domain.entity.City;
import com.chinauicom.bluesky.domain.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 * 多表查询 - 示例
 */
public interface PersonQueryRepository extends Repository<Actor, Integer> {

    @Query("select h "
            + "from Person h left outer join h.city r where h.city = ?1 group by h")
    Page<Person> findPersonByName(City city, Pageable pageable);


}
