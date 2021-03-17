package com.tlc.t11.DataAccess;

import com.tlc.t11.Models.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //data access annotation
public interface OrderRepository extends JpaRepository<OrderModel, Long> {
    // get one order interface
    @Query("Select o from OrderModel o Where o.id =?1")
    Optional<OrderModel> getOneOrder(Long id);
}