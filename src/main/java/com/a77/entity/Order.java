package com.a77.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String pickupPoint;
	private String deliveryPoint;
	private int weight;
	private int height;
	private int length;
	private int width;
	private boolean fragileСargo;
	private int pickupDate;
	private int pickupMonth;
	private int pickupYear;	
	private int deliveryDate;
	private int deliveryMonth;
	private int deliveryYear;
	private int desiredPrice;
	
	
	
	public Order() {
	}
	public Order(String pickupPoint, String deliveryPoint, int weight, int height, int length, int width,
			boolean fragileСargo, int pickupDate, int pickupMonth, int pickupYear, int deliveryDate, int deliveryMonth,
			int deliveryYear, int desiredPrice) {
		super();
		this.pickupPoint = pickupPoint;
		this.deliveryPoint = deliveryPoint;
		this.weight = weight;
		this.height = height;
		this.length = length;
		this.width = width;
		this.fragileСargo = fragileСargo;
		this.pickupDate = pickupDate;
		this.pickupMonth = pickupMonth;
		this.pickupYear = pickupYear;
		this.deliveryDate = deliveryDate;
		this.deliveryMonth = deliveryMonth;
		this.deliveryYear = deliveryYear;
		this.desiredPrice = desiredPrice;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPickupPoint() {
		return pickupPoint;
	}
	public void setPickupPoint(String pickupPoint) {
		this.pickupPoint = pickupPoint;
	}
	public String getDeliveryPoint() {
		return deliveryPoint;
	}
	public void setDeliveryPoint(String deliveryPoint) {
		this.deliveryPoint = deliveryPoint;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public boolean isFragileСargo() {
		return fragileСargo;
	}
	public void setFragileСargo(boolean fragileСargo) {
		this.fragileСargo = fragileСargo;
	}
	public int getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(int pickupDate) {
		this.pickupDate = pickupDate;
	}
	public int getPickupMonth() {
		return pickupMonth;
	}
	public void setPickupMonth(int pickupMonth) {
		this.pickupMonth = pickupMonth;
	}
	public int getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(int deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public int getDeliveryMonth() {
		return deliveryMonth;
	}
	public void setDeliveryMonth(int deliveryMonth) {
		this.deliveryMonth = deliveryMonth;
	}
	public int getPickupYear() {
		return pickupYear;
	}
	public void setPickupYear(int pickupYear) {
		this.pickupYear = pickupYear;
	}
	public int getDeliveryYear() {
		return deliveryYear;
	}
	public void setDeliveryYear(int deliveryYear) {
		this.deliveryYear = deliveryYear;
	}
	public int getDesiredPrice() {
		return desiredPrice;
	}
	public void setDesiredPrice(int desiredPrice) {
		this.desiredPrice = desiredPrice;
	}

}
