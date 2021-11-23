package com.icss.maven_ssh.dao.impl;

import com.icss.maven_ssh.dao.IPersonDao;
import com.icss.maven_ssh.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("personDao")
public class PersonDaoImpl implements IPersonDao {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Person> findAll() {
        return getSession().createQuery("from Person").list();
    }

}
