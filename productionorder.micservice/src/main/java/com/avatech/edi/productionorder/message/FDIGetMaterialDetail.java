
package com.avatech.edi.productionorder.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FDIGetMaterialDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FDIGetMaterialDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReciverID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Whscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseLinerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitMsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flag_In" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateTimeIn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FDIGetMaterialDetail", propOrder = {
    "pkno",
    "reciverID",
    "lineId",
    "itemCode",
    "itemName",
    "quantity",
    "whscode",
    "purchaseOrder",
    "purchaseLinerId",
    "unitMsr",
    "batchNo",
    "flagIn",
    "dateTimeIn"
})
public class FDIGetMaterialDetail {

    @XmlElement(name = "PKNO")
    protected String pkno;
    @XmlElement(name = "ReciverID")
    protected String reciverID;
    @XmlElement(name = "LineId")
    protected String lineId;
    @XmlElement(name = "ItemCode")
    protected String itemCode;
    @XmlElement(name = "ItemName")
    protected String itemName;
    @XmlElement(name = "Quantity", required = true, type = Integer.class, nillable = true)
    protected Integer quantity;
    @XmlElement(name = "Whscode")
    protected String whscode;
    @XmlElement(name = "PurchaseOrder")
    protected String purchaseOrder;
    @XmlElement(name = "PurchaseLinerId")
    protected String purchaseLinerId;
    @XmlElement(name = "UnitMsr")
    protected String unitMsr;
    @XmlElement(name = "BatchNo")
    protected String batchNo;
    @XmlElement(name = "Flag_In")
    protected int flagIn;
    @XmlElement(name = "DateTimeIn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeIn;

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
     * 获取reciverID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReciverID() {
        return reciverID;
    }

    /**
     * 设置reciverID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReciverID(String value) {
        this.reciverID = value;
    }

    /**
     * 获取lineId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * 设置lineId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * 获取itemCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置itemCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * 获取itemName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置itemName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * 获取whscode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhscode() {
        return whscode;
    }

    /**
     * 设置whscode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhscode(String value) {
        this.whscode = value;
    }

    /**
     * 获取purchaseOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * 设置purchaseOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrder(String value) {
        this.purchaseOrder = value;
    }

    /**
     * 获取purchaseLinerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseLinerId() {
        return purchaseLinerId;
    }

    /**
     * 设置purchaseLinerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseLinerId(String value) {
        this.purchaseLinerId = value;
    }

    /**
     * 获取unitMsr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitMsr() {
        return unitMsr;
    }

    /**
     * 设置unitMsr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitMsr(String value) {
        this.unitMsr = value;
    }

    /**
     * 获取batchNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 设置batchNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNo(String value) {
        this.batchNo = value;
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

}
