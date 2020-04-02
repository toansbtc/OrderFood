package com.NguyenToan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="food")
public class Food {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IdFood;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="IdTypeFood")
	private TypeFood typefood;
	
	
	
}
