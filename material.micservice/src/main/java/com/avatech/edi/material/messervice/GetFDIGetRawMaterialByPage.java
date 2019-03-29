
package com.avatech.edi.material.messervice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isAsc" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sWhere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pageSize",
    "pageIndex",
    "isAsc",
    "orderField",
    "sWhere"
})
@XmlRootElement(name = "GetFDIGetRawMaterialByPage")
public class GetFDIGetRawMaterialByPage {

    protected int pageSize;
    protected int pageIndex;
    protected boolean isAsc;
    protected String orderField;
    protected String sWhere;

    /**
     * 获取pageSize属性的值。
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置pageSize属性的值。
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * 获取pageIndex属性的值。
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * 设置pageIndex属性的值。
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * 获取isAsc属性的值。
     * 
     */
    public boolean isIsAsc() {
        return isAsc;
    }

    /**
     * 设置isAsc属性的值。
     * 
     */
    public void setIsAsc(boolean value) {
        this.isAsc = value;
    }

    /**
     * 获取orderField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderField() {
        return orderField;
    }

    /**
     * 设置orderField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderField(String value) {
        this.orderField = value;
    }

    /**
     * 获取sWhere属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWhere() {
        return sWhere;
    }

    /**
     * 设置sWhere属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWhere(String value) {
        this.sWhere = value;
    }

}
