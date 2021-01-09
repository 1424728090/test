package com.common;

/**
 * 寿司订单对象表
 * 
 * @author My
 * @Date 2019/3
 */
public class Order {
	//编号
	private int id;
	//订单编号
	private String orderId;
	//套餐金额
	private float goodsTotalPrice;
	//套餐编号
	private int goodsId;
	//套餐单价
	private float goodsPrice;
	//商品数量
	private int goodsNum;
	//套餐名称
	private String goodsName;
	// 订单状态 0 未处理（可以取消）1 已接受烹饪中 2 已送达已付款 3 已付款已完成 4已取消
	private int orderStatus;
	//套餐数量
	private int orderNum;
	//总金额
	private float orderTotalMoney;
	//用户名
	private String userName;
	//构造方法
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	//订单状态表的构造方法
	public Order(String orderId, int orderStatus, int orderNum, float orderTotalMoney, String userName) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.orderNum = orderNum;
		this.orderTotalMoney = orderTotalMoney;
		this.userName = userName;
	}

	//订单表的构造方法
	public Order(String orderId, float goodsTotalPrice, int goodsId, float goodsPrice, int goodsNum, String goodsName) {
		super();
		this.orderId = orderId;
		this.goodsTotalPrice = goodsTotalPrice;
		this.goodsId = goodsId;
		this.goodsPrice = goodsPrice;
		this.goodsNum = goodsNum;
		this.goodsName = goodsName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public float getGoodsTotalPrice() {
		return goodsTotalPrice;
	}

	public void setGoodsTotalPrice(float goodsTotalPrice) {
		this.goodsTotalPrice = goodsTotalPrice;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public float getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public int getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public float getOrderTotalMoney() {
		return orderTotalMoney;
	}

	public void setOrderTotalMoney(float orderTotalMoney) {
		this.orderTotalMoney = orderTotalMoney;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
