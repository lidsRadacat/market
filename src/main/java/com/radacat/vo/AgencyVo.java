package com.radacat.vo;

import java.io.Serializable;
import java.util.Date;

import com.radacat.domain.Partner;
import com.radacat.domain.Product;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月3日 下午7:37:05
 * @version: V1.0
 */
public class AgencyVo implements Serializable{
	
	/**
	 * serialVersionUID
	 * long
	 */
	private static final long serialVersionUID = 8055729569532198415L;
    private Long id;

    private String active;
	//提货数量
    private Double pickingCount;

	//提货单价
    private Double pickingPrice;

	//提货总价
    private Integer pickingTotal;

    
	//商品编号
    private Integer productId;

   
	//折扣
    private Double discount;

   
    //当地注册人数
    private Integer registerCount;


    //地区编号
    private Integer areaId;

    private Long createUid;

    private Long writeUid;

    private Date createDate;
    private Date writeDate;
	private Product product;
	private AddressVo addressVo;
	private Partner partner;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public Double getPickingCount() {
		return pickingCount;
	}
	public void setPickingCount(Double pickingCount) {
		this.pickingCount = pickingCount;
	}
	public Double getPickingPrice() {
		return pickingPrice;
	}
	public void setPickingPrice(Double pickingPrice) {
		this.pickingPrice = pickingPrice;
	}
	public Integer getPickingTotal() {
		return pickingTotal;
	}
	public void setPickingTotal(Integer pickingTotal) {
		this.pickingTotal = pickingTotal;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Integer getRegisterCount() {
		return registerCount;
	}
	public void setRegisterCount(Integer registerCount) {
		this.registerCount = registerCount;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public Long getCreateUid() {
		return createUid;
	}
	public void setCreateUid(Long createUid) {
		this.createUid = createUid;
	}
	public Long getWriteUid() {
		return writeUid;
	}
	public void setWriteUid(Long writeUid) {
		this.writeUid = writeUid;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public AddressVo getAddressVo() {
		return addressVo;
	}
	public void setAddressVo(AddressVo addressVo) {
		this.addressVo = addressVo;
	}
	public Partner getPartner() {
		return partner;
	}
	public void setPartner(Partner partner) {
		this.partner = partner;
	}
	@Override
	public String toString() {
		return "AgencyVo [id=" + id + ", active=" + active + ", pickingCount=" + pickingCount + ", pickingPrice="
				+ pickingPrice + ", pickingTotal=" + pickingTotal + ", productId=" + productId + ", discount="
				+ discount + ", registerCount=" + registerCount + ", areaId=" + areaId + ", createUid=" + createUid
				+ ", writeUid=" + writeUid + ", createDate=" + createDate + ", writeDate=" + writeDate + ", product="
				+ product + ", addressVo=" + addressVo + ", parner=" + partner + "]";
	}
	
}
