package com.intelligrated.download.mapper.entity.header;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.intelligrated.download.mapper.entity.AbstractEntity;
import com.intelligrated.download.mapper.entity.IEntity;

/**
 * Represents the eporder table (or subset) with fields (called 'field title'):
 * 
 * comment_1|comment_2|dl_batch|c_order_nbr|misc_field_1|comment_3|comment_4|comment_5|comment_6|comment_8|order_nbr|carton_id|misc_int1|misc_field_2|misc_field_3|comment_9
 * 
 * from EasyPickDB_Structure_final.sql
 * 
 * "order_seq integer, {Assigned by filetodb - unique per row}"
 * 
 * @author matt.aspen
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = HeaderEntity.tableName)
public class HeaderEntity extends AbstractEntity implements IEntity {
	public static final String tableName = "eporder";
	
	@Column(name = "seq_num")
	private Integer sequenceNumber;
	
	/** these are "field title"s */
	@Column(name = "comment_1")
	private String comment1;
	
	@Column(name = "comment_2")
	private String comment2;
	
	@Column(name = "dl_batch")
	private String dlBatch;
	
	@Column(name = "c_order_nbr")
	private String cOrderNumber;
	
	@Column(name = "misc_field_1")
	private String miscField1;
	
	@Column(name = "comment_3")
	private String comment3;
	
	@Column(name = "comment_4")
	private String comment4;
	
	@Column(name = "comment_5")
	private String comment5;
	
	@Column(name = "comment_6")
	private String comment6;
	
	@Column(name = "comment_8")
	private String comment8;
	
	@Column(name = "order_nbr")
	private String orderNumber;
	
	@Column(name = "carton_id")
	private String cartonId;
	
	@Column(name = "misc_int1")
	private Integer miscInt1;
	
	@Column(name = "misc_field_2")
	private String miscField2;
	
	@Column(name = "misc_field_3")
	private String miscField3;
	
	@Column(name = "comment_9")
	private String comment9;

	public Integer getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getComment1() {
		return comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

	public String getComment2() {
		return comment2;
	}

	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

	public String getDlBatch() {
		return dlBatch;
	}

	public void setDlBatch(String dlBatch) {
		this.dlBatch = dlBatch;
	}

	public String getcOrderNumber() {
		return cOrderNumber;
	}

	public void setcOrderNumber(String cOrderNumber) {
		this.cOrderNumber = cOrderNumber;
	}

	public String getMiscField1() {
		return miscField1;
	}

	public void setMiscField1(String miscField1) {
		this.miscField1 = miscField1;
	}

	public String getComment3() {
		return comment3;
	}

	public void setComment3(String comment3) {
		this.comment3 = comment3;
	}

	public String getComment4() {
		return comment4;
	}

	public void setComment4(String comment4) {
		this.comment4 = comment4;
	}

	public String getComment5() {
		return comment5;
	}

	public void setComment5(String comment5) {
		this.comment5 = comment5;
	}

	public String getComment6() {
		return comment6;
	}

	public void setComment6(String comment6) {
		this.comment6 = comment6;
	}

	public String getComment8() {
		return comment8;
	}

	public void setComment8(String comment8) {
		this.comment8 = comment8;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCartonId() {
		return cartonId;
	}

	public void setCartonId(String cartonId) {
		this.cartonId = cartonId;
	}

	public Integer getMiscInt1() {
		return miscInt1;
	}

	public void setMiscInt1(Integer miscInt1) {
		this.miscInt1 = miscInt1;
	}

	public String getMiscField2() {
		return miscField2;
	}

	public void setMiscField2(String miscField2) {
		this.miscField2 = miscField2;
	}

	public String getMiscField3() {
		return miscField3;
	}

	public void setMiscField3(String miscField3) {
		this.miscField3 = miscField3;
	}

	public String getComment9() {
		return comment9;
	}

	public void setComment9(String comment9) {
		this.comment9 = comment9;
	}

	public static String getTablename() {
		return tableName;
	}
}
