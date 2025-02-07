package com.zth.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Author: 3zZ.
 * Date: 2020/1/11 3:24 上午
 * @author 3zz
 */
@Entity
@Table
public class MetaDatabase {
    @Id
    @GeneratedValue
    /**数据库ID*/
    private Integer id;

    /**数据库名称*/
    private String name;

    /**数据库存放的文件系统地址*/
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
