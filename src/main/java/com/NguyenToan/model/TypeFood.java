package com.NguyenToan.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="typefood")
public class TypeFood {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IdTypeFood;
	
	@Column(name="NameOfType")
	private String NameOfType;
	
	@Column(name="ImageType")
	private String PathImageType;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typefood")
	private Set<Food> foods;
	
	
	public Set<Food> getFoods() {
		return foods;
	}
	public void setFoods(Set<Food> foods) {
		this.foods = foods;
	}
	public int getIdTypeFood() {
		return IdTypeFood;
	}
	public void setIdTypeFood(int idTypeFood) {
		IdTypeFood = idTypeFood;
	}
	public String getNameOfType() {
		return NameOfType;
	}
	public void setNameOfType(String nameOfType) {
		NameOfType = nameOfType;
	}
	public String getPathImageType() {
		return PathImageType;
	}
	public void setPathImageType(String pathImageType) {
		PathImageType = pathImageType;
	}
	public TypeFood(int idTypeFood, String nameOfType, String pathImageType) {
		super();
		IdTypeFood = idTypeFood;
		NameOfType = nameOfType;
		PathImageType = pathImageType;
	}
	public TypeFood() {
		super();
	}
	

}
