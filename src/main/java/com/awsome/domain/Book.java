package com.awsome.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "t_book")
public class Book implements Serializable{
	@Id
	@GeneratedValue
	private Integer	id;
	private String	name;
	private String	num;



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getNum() {
		return num;
	}



	public void setNum(String num) {
		this.num = num;
	}
}
