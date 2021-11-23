package com.icss.maven_ssh.action;

import com.icss.maven_ssh.entity.Person;
import com.icss.maven_ssh.service.IPersonService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PersonAction {

    private List<Person> list;

    @Resource(name="personService")
    private IPersonService personService;

    public String findAll(){
        list = personService.findAll();
        System.out.println("测试修改了");
        return "list";
    }

    public List<Person> getList() {
        return list;
    }
    public void setList(List<Person> list) {
        this.list = list;
    }
    public IPersonService getPersonService() {
        return personService;
    }
    public void setPersonService(IPersonService personService) {
        this.personService = personService;
    }
}

