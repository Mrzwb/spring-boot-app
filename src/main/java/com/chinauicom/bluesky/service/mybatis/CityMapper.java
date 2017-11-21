package com.chinauicom.bluesky.service.mybatis;

import com.chinauicom.bluesky.domain.mybatis.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
@Mapper
public interface CityMapper {

    @Select("SELECT * FROM city WHERE city = #{city}")
    City findByName(String city);


}
