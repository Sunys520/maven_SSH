package com.icss.maven_ssh.service.impl;

import com.icss.maven_ssh.dao.IPersonDao;
import com.icss.maven_ssh.entity.Person;
import com.icss.maven_ssh.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Repository("personService")
@Transactional
public class PersonServiceImpl implements IPersonService {

    @Resource(name="personDao")
    private IPersonDao personDao;

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }
}
