package com.educandoweb.course.repositories;

import com.educandoweb.course.dominio.OrderItem;
import com.educandoweb.course.dominio.User;
import com.educandoweb.course.dominio.pk.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
