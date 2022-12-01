package com.learning.vo.filter;

import java.util.List;

import javax.persistence.MappedSuperclass;

import lombok.Data;
@Data
@MappedSuperclass
public class BaseFilter {
	
	private String id;
	private List<String> ids;
	private String createdOn;
	private String modifiedOn;
	private String createdBy;
	private String modifiedBy;
	private String createdName;
	private String modifiedName;
	private boolean isActive;

}
