package com.chinauicom.bluesky.domain.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 抽象实体类
 * @author zhouwb15
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {


    @Id
    @GeneratedValue
    protected int id;
    @CreatedDate
    protected LocalDateTime createdDt;

    @LastModifiedDate
    protected LocalDateTime modifiedDt;
}
