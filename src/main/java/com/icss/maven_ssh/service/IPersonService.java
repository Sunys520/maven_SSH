package com.icss.maven_ssh.service;

import com.icss.maven_ssh.entity.Person;

import java.util.List;

public interface IPersonService {
    public List<Person> findAll();
}
