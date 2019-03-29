
package com.avatech.edi.material.messervice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FDIPostSaleOrder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FDIPostSaleOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shiptocode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CntctCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Udf1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Udf2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Udf3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Udf4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Udf5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flag_In" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateTimeIn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Details" type="{http://fanuc.com.cn/}ArrayOfFDIPostSaleOrderDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FDIPostSaleOrder", propOrder = {
    "pkno",
    "cardCode",
    "cardName",
    "shiptocode",
    "address3",
    "phone1",
    "cntctCode",
    "docType",
    "docDate",
    "docStatus",
    "docEntry",
    "comments",
    "userSign",
    "payType",
    "deliveryNum",
    "docTime",
    "udf1",
    "udf2",
    "udf3",
    "udf4",
    "udf5",
    "flagIn",
    "dateTimeIn",
    "details"
})
public class FDIPostSaleOrder {

    @XmlElement(name = "PKNO")
    protected String pkno;
    @XmlElement(name = "CardCode")
    protected String cardCode;
    @XmlElement(name = "CardName")
    protected String cardName;
    @XmlElement(name = "Shiptocode")
    protected String shiptocode;
    @XmlElement(name = "Address3")
    protected String address3;
    @XmlElement(name = "Phone1")
    protected String phone1;
    @XmlElement(name = "CntctCode")
    protected String cntctCode;
    @XmlElement(name = "DocType")
    protected String docType;
    @XmlElement(name = "DocDate")
    protected String docDate;
    @XmlElement(name = "DocStatus")
    protected String docStatus;
    @XmlElement(name = "DocEntry")
    protected String docEntry;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "UserSign")
    protected String userSign;
    @XmlElement(name = "PayType")
    protected String payType;
    @XmlElement(name = "DeliveryNum")
    protected String deliveryNum;
    @XmlElement(name = "DocTime")
    protected String docTime;
    @XmlElement(name = "Udf1")
    protected String udf1;
    @XmlElement(name = "Udf2")
    protected String udf2;
    @XmlElement(name = "Udf3")
    protected String udf3;
    @XmlElement(name = "Udf4")
    protected String udf4;
    @XmlElement(name = "Udf5")
    protected String udf5;
    @XmlElement(name = "Flag_In")
    protected int flagIn;
    @XmlElement(name = "DateTimeIn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeIn;
    @XmlElement(name = "Details")
    protected ArrayOfFDIPostSaleOrderDetail details;

    /**
     * 获取pkno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKNO() {
        return pkno;
    }

    /**
     * 设置pkno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKNO(String value) {
        this.pkno = value;
    }

    /**
     * 获取cardCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置cardCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * 获取cardName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * 设置cardName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardName(String value) {
        this.cardName = value;
    }

    /**
     * 获取shiptocode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShiptocode() {
        return shiptocode;
    }

    /**
     * 设置shiptocode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiptocode(String value) {
        this.shiptocode = value;
    }

    /**
     * 获取address3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * 设置address3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * 获取phone1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * 设置phone1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone1(String value) {
        this.phone1 = value;
    }

    /**
     * 获取cntctCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntctCode() {
        return cntctCode;
    }

    /**
     * 设置cntctCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntctCode(String value) {
        this.cntctCode = value;
    }

    /**
     * 获取docType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * 设置docType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * 获取docDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocDate() {
        return docDate;
    }

    /**
     * 设置docDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocDate(String value) {
        this.docDate = value;
    }

    /**
     * 获取docStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocStatus() {
        return docStatus;
    }

    /**
     * 设置docStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocStatus(String value) {
        this.docStatus = value;
    }

    /**
     * 获取docEntry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocEntry() {
        return docEntry;
    }

    /**
     * 设置docEntry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocEntry(String value) {
        this.docEntry = value;
    }

    /**
     * 获取comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * 获取userSign属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSign() {
        return userSign;
    }

    /**
     * 设置userSign属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSign(String value) {
        this.userSign = value;
    }

    /**
     * 获取payType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置payType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayType(String value) {
        this.payType = value;
    }

    /**
     * 获取deliveryNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNum() {
        return deliveryNum;
    }

    /**
     * 设置deliveryNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryNum(String value) {
        this.deliveryNum = value;
    }

    /**
     * 获取docTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTime() {
        return docTime;
    }

    /**
     * 设置docTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTime(String value) {
        this.docTime = value;
    }

    /**
     * 获取udf1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf1() {
        return udf1;
    }

    /**
     * 设置udf1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf1(String value) {
        this.udf1 = value;
    }

    /**
     * 获取udf2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf2() {
        return udf2;
    }

    /**
     * 设置udf2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf2(String value) {
        this.udf2 = value;
    }

    /**
     * 获取udf3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf3() {
        return udf3;
    }

    /**
     * 设置udf3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf3(String value) {
        this.udf3 = value;
    }

    /**
     * 获取udf4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf4() {
        return udf4;
    }

    /**
     * 设置udf4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf4(String value) {
        this.udf4 = value;
    }

    /**
     * 获取udf5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdf5() {
        return udf5;
    }

    /**
     * 设置udf5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdf5(String value) {
        this.udf5 = value;
    }

    /**
     * 获取flagIn属性的值。
     * 
     */
    public int getFlagIn() {
        return flagIn;
    }

    /**
     * 设置flagIn属性的值。
     * 
     */
    public void setFlagIn(int value) {
        this.flagIn = value;
    }

    /**
     * 获取dateTimeIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeIn() {
        return dateTimeIn;
    }

    /**
     * 设置dateTimeIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeIn(XMLGregorianCalendar value) {
        this.dateTimeIn = value;
    }

    /**
     * 获取details属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostSaleOrderDetail }
     *     
     */
    public ArrayOfFDIPostSaleOrderDetail getDetails() {
        return details;
    }

    /**
     * 设置details属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostSaleOrderDetail }
     *     
     */
    public void setDetails(ArrayOfFDIPostSaleOrderDetail value) {
        this.details = value;
    }

}
