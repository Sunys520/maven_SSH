package com.icss.maven_ssh.dao;

import com.icss.maven_ssh.entity.Person;

import java.util.List;

public interface IPersonDao {
    public List<Person> findAll();
}
