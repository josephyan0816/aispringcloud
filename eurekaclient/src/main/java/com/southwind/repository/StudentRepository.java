package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.Collection;

/**
 * StudentRepository
 *
 * @author Joseph
 * @version 1.0
 * 2019/10/28 16:18
 **/
public interface StudentRepository {

    public Collection<Student> findAll();

    public Student findById(long id);

    public void saveOrUpdate(Student student);

    public void deleteById(long id);
}
