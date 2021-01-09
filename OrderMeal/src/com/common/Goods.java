package com.common;

/**
 * 寿司商品表
 * 
 * @author My
 * @Date 2019/3
 */
public class Goods {
	private int id;//编号
	private String goodsName;//商品名字
	private String goodsDesc;//商品描述
	private float price;// 价格
	private float price1;
	private String imageLink;//图片地址

	//构造方法
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(int id, String goodsName, String goodsDesc, float price, String imageLink) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.goodsDesc = goodsDesc;
		this.price = price;
		this.imageLink = imageLink;
	}

	public Goods(String goodsName, String goodsDesc, float price, String imageLink) {
		super();
		this.goodsName = goodsName;
		this.goodsDesc = goodsDesc;
		this.price = price;
		this.imageLink = imageLink;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice1() {
		return price1;
	}

	public void setPrice1(float price1) {
		this.price1 = price1;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

}
