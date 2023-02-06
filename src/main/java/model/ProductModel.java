package model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class ProductModel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name = "productid", nullable = false)
private UUID productid;

@Column(name = "name", nullable = false)
private String name;

@Column(name = "type", nullable = false)
private String type;

@Column(name = "quantity", nullable = false)
private String quantity;

@Column(name = "amount", nullable = false)
private Float amount;

@Column(name = "store", nullable = true)
private String store;
  


}
