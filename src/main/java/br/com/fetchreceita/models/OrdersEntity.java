package br.com.fetchreceita.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class OrdersEntity {

    @Column(name = "order_status")
    private String status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrdersEntity{" +
                "status='" + status + '\'' +
                ", orderId=" + orderId +
                '}';
    }
}
