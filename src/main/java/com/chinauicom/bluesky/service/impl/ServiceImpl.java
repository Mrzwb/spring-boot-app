package com.chinauicom.bluesky.service.impl;

import com.chinauicom.bluesky.bean.JdbcBean;
import com.chinauicom.bluesky.config.BaseConfig;
import com.chinauicom.bluesky.domain.entity.Actor;
import com.chinauicom.bluesky.domain.entity.City;
import com.chinauicom.bluesky.domain.entity.Person;
import com.chinauicom.bluesky.repositories.ActorRepository;
import com.chinauicom.bluesky.repositories.PersonQueryRepository;
import com.chinauicom.bluesky.repositories.PersonRepository;
import com.chinauicom.bluesky.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Map;

/**
 * 业务层示例
 */
@Service
public class ServiceImpl implements IService {

    @Autowired
    private BaseConfig baseConfig;

    @Autowired
    private JdbcBean jdbcBean;

    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonQueryRepository personQueryRepositoryRepository;

    @Override
    @Transactional(rollbackOn = {Exception.class})
    public Page<Actor> findAll(Pageable pageable) {

        System.out.println("====== 访问配置属性 ======");
        baseConfig.getServers().forEach((s)->{
            System.out.println( "server is : " + s);
        });

        System.out.println(  baseConfig.getPort());

        System.out.println("====== JDBCTemlate 访问数据库======");
        String sql = "select now() as todaty from dual";
        Map<String,Object> map = jdbcBean.build().queryForMap(sql);
        map.forEach((k,v)->{
            System.out.println(k+":" + v);
        });

        System.out.println("====== JPA 访问数据库======");
        Page<Actor> actorList = actorRepository.findAll(pageable);

        return actorList;
    }

    @Override
    public Page<Person> findPersonList(Pageable pageable) {

        City city = new City();
        city.setCity_id(1);

        return  personQueryRepositoryRepository.findPersonByName(city,pageable);
    }

    @Override
    public Person findPerson(Person person) {

        return personRepository.findPerson(person);

    }
}
