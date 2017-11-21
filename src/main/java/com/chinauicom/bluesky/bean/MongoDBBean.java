package com.chinauicom.bluesky.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

@Component
public class MongoDBBean extends Aware<MongoDbFactory>{

    @Autowired
    public MongoDBBean(MongoDbFactory mongo) {
        super(mongo);
    }

}

