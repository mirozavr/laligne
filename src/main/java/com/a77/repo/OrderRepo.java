package com.a77.repo;

import org.springframework.data.repository.CrudRepository;

import com.a77.entity.Order;

public interface OrderRepo extends CrudRepository<Order, Long>{

}
