package com.kodilla.hibernate.invoce.dao;

import com.kodilla.hibernate.invoce.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ItemDao  extends CrudRepository<Item, Integer> {
}
