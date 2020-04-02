package com.NguyenToan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class Image {
	
	@Id
	@Column(name="IdImage")
	private int IdImage;
	
	@Column(name="Path")
	private String Path;
}
