
package com.avatech.edi.productionorder.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FDIPostWOClose complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FDIPostWOClose">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docentry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Udf1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Udf2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Udf3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Udf4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Udf5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flag_In" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateTimeIn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Details" type="{http://fanuc.com.cn/}ArrayOfFDIPostWOCloseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FDIPostWOClose", propOrder = {
    "pkno",
    "docDate",
    "docentry",
    "comments",
    "status",
    "userSign",
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
public class FDIPostWOClose {

    @XmlElement(name = "PKNO")
    protected String pkno;
    @XmlElement(name = "DocDate")
    protected String docDate;
    @XmlElement(name = "Docentry")
    protected String docentry;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "UserSign")
    protected String userSign;
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
    protected ArrayOfFDIPostWOCloseDetail details;

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
     * 获取docentry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocentry() {
        return docentry;
    }

    /**
     * 设置docentry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocentry(String value) {
        this.docentry = value;
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
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     *     {@link ArrayOfFDIPostWOCloseDetail }
     *     
     */
    public ArrayOfFDIPostWOCloseDetail getDetails() {
        return details;
    }

    /**
     * 设置details属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostWOCloseDetail }
     *     
     */
    public void setDetails(ArrayOfFDIPostWOCloseDetail value) {
        this.details = value;
    }

}
