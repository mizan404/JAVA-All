package com.sany.service;

import java.util.List;

public interface CommonService<T> {
    
    void createTable();

    void save(T t);

    void update(T t);

    void delete(int id);

    T get(int id);

    List<T> getList();
}
