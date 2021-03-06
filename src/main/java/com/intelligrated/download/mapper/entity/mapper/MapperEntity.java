package com.intelligrated.download.mapper.entity.mapper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.intelligrated.download.mapper.entity.AbstractEntity;
import com.intelligrated.download.mapper.entity.EntityTypeEnum;
/**
 * Represents the def_down_up table mapping.
 * 
 * Example of similar mapping used in H2 db to which this class is
 * an Entity for:
 * 
 * CREATE TABLE def_down_up (
		id INTEGER NOT NULL PRIMARY KEY,
		entity_type INTEGER, // added so can differentiate b/w types of Entities (header, order line ...)
		field_name VARCHAR(30),
		field_title VARCHAR(30),
		field_tab_name VARCHAR(30),
		index_start INTEGER,
		index_length INTEGER,
		data_type VARCHAR(10),
		record_code VARCHAR(1) // 1=down, 2=up ...
	);
 * 
 * @author matt.aspen
 */
@SuppressWarnings("serial")
@Entity
@Table(name = MapperEntity.tableName)
public class MapperEntity extends AbstractEntity {
	public static final String tableName = "def_down_up";
	
	/**
	 * Added column so its easier to differentiate
	 * b/w the 'types' of Entities in an download file
	 * 1 = header, 2 = order line, ... 
	 */
	@Column(name = "entity_type")
	private Integer entityType;
	
	@Column(name = "field_name")
	private String fieldName;
	
	@Column(name = "field_title")
	private String fieldTitle;
	
	@Column(name = "field_tab_name")
	private String fieldTableName;

	@Column(name = "index_start")
	private Integer indexStart;
	
	@Column(name = "index_length")
	private Integer indexLength;
	
	@Column(name = "data_type")
	private String dataType;
	
	@Column(name = "record_code")
	private String recordCode;
	
	/* Bit finnicky w/ the enums 
	 * http://stackoverflow.com/questions/2751733/map-enum-in-jpa-with-fixed-values
	 * */
	public EntityTypeEnum getEntityType() {
		return EntityTypeEnum.parse(entityType);
	}

	public void setEntityType(EntityTypeEnum entityType) {
		this.entityType = entityType.getValue();
	}

	public String getFieldName() {
		return fieldName;
	}


	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}


	public String getFieldTitle() {
		return fieldTitle;
	}


	public void setFieldTitle(String fieldTitle) {
		this.fieldTitle = fieldTitle;
	}


	public String getFieldTableName() {
		return fieldTableName;
	}


	public void setFieldTableName(String fieldTableName) {
		this.fieldTableName = fieldTableName;
	}


	public Integer getIndexStart() {
		return indexStart;
	}


	public void setIndexStart(Integer indexStart) {
		this.indexStart = indexStart;
	}


	public Integer getIndexLength() {
		return indexLength;
	}


	public void setIndexLength(Integer indexLength) {
		this.indexLength = indexLength;
	}


	public String getDataType() {
		return dataType;
	}


	public void setDataType(String dataType) {
		this.dataType = dataType;
	}


	public String getRecordCode() {
		return recordCode;
	}


	public void setRecordCode(String recordCode) {
		this.recordCode = recordCode;
	}


	public static String getTablename() {
		return tableName;
	}


	@Override
	public String toString() {
		return String.format(
				"MapperEntity[id=%d, fieldName=%s, fieldTitle=%s, fieldTableName=%s, indexStart=%d, indexLength=%d, dataType=%s, recordCode=%s]", 
				getId(), fieldName, fieldTitle, fieldTableName, indexStart, indexLength, dataType, recordCode);
	}
}
