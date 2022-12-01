package com.learning.vo.common;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class AbstractEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2665326522491882255L;
	@Id
	@GeneratedValue(generator = "custom-uuid")
	@GenericGenerator(name = "custom-uuid",strategy = "com.learning.utils.CustomUUIDGenerator")
	private String id;

}
