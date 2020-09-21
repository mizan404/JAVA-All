/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohdm
 */
public interface CommonService<T> {

    void createTable();

    void save(T t);

    void update(T t);

    void delete(String id);

    void delete(int id);

    void delete();

    T get(String id);

    T getByName(String name);

    ArrayList<T> getList();

    T getUserByUsernameAndPassword(String username, String password);
}
