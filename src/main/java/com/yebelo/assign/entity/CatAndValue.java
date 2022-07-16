package com.yebelo.assign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
@Component
public class CatAndValue {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
 private Integer id;

@Column(nullable = false)
 private String categoryCode;

@Column(nullable = false)
 private int value;

public void setId(int id) {
	this.id = id;
}

public String getCategoryCode() {
	return categoryCode;
}

public void setCategoryCode(String categoryCode) {
	this.categoryCode = categoryCode;
}

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

@Override
public String toString() {
	return "Table [id=" + id + ", categoryCode=" + categoryCode + ", value=" + value + "]";
}


}
