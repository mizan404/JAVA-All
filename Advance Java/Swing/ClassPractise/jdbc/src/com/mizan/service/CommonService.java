/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.service;

import java.util.List;

public interface CommonService<T> {

    void createTable();

    void save(T t);

    void update(T t);

    void delete(int id);

    T get(int id);

    List<T> getList();
}
