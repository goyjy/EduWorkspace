package com.yzq.edu.mapper.base;

public interface BaseMapper<T> {

    public T findById(Integer id);
    public T findByUuid(String uuid);

    public void deleteById(Integer id);
    public void deleteByUuid(String uuid);

    public void update(T t);

    public int insert(T t);


}
