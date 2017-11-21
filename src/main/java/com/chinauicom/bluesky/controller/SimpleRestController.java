package com.chinauicom.bluesky.controller;


import com.chinauicom.bluesky.domain.entity.Actor;
import com.chinauicom.bluesky.domain.entity.Person;
import com.chinauicom.bluesky.domain.mybatis.City;
import com.chinauicom.bluesky.service.IService;
import com.chinauicom.bluesky.service.mybatis.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简易Rest控制器 - 示例
 */
@RestController
public class SimpleRestController {

    @Autowired
    private IService serviceImpl;

    @Autowired
    private CityMapper cityMapper;

    @RequestMapping(value="/getActorList", method= RequestMethod.GET)
    public Page<Actor> getActorList() {

        Pageable pageable = new QPageRequest(1,21);

        Page<Actor> actorList = serviceImpl.findAll(pageable);

        return actorList;
    }

    @RequestMapping(value="/getPerson", method= RequestMethod.GET, produces={"application/json; charset=UTF-8"})
    public Person getPerson() {
        Person p = new Person();
        p.setName("David");
        Person person = serviceImpl.findPerson(p);

        return person;
    }

    @RequestMapping(value="/getPersonList", method= RequestMethod.GET)
    public Page<Person> getPersonList() {
        Pageable pageable = new QPageRequest(1,21);
        Page<Person>  personList = serviceImpl.findPersonList(pageable);

        return personList;
    }

    /**
     * mybatis 示例
     */
    @RequestMapping("/findCity")
    public City findByName(){
        String cityName = "Allende";

        City city = cityMapper.findByName(cityName);

        return city;

    }


}
