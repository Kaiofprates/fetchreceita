package br.com.fetchreceita.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customers")
public class CustomersEntity {

    @Column(name = "customer_name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Set<OrdersEntity> orderList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Set<OrdersEntity> orderList2;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<OrdersEntity> getOrderList() {
        return orderList;
    }

    public void setOrderList(Set<OrdersEntity> orderList) {
        this.orderList = orderList;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }



    public Set<OrdersEntity> getOrderList2() {
        return orderList2;
    }

    public void setOrderList2(Set<OrdersEntity> orderList2) {
        this.orderList2 = orderList2;
    }

    @Override
    public String toString() {
        return "CustomersEntity{" +
                "name='" + name + '\'' +
                ", customerId=" + customerId +
                ", orderList=" + orderList +
                ", orderList2=" + orderList2 +
                '}';
    }
}
