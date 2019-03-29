
package com.avatech.edi.material.messervice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetFDIPostSaleOrderDetailByIdResult" type="{http://fanuc.com.cn/}FDIPostSaleOrderDetail" minOccurs="0"/>
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
    "getFDIPostSaleOrderDetailByIdResult"
})
@XmlRootElement(name = "GetFDIPostSaleOrderDetailByIdResponse")
public class GetFDIPostSaleOrderDetailByIdResponse {

    @XmlElement(name = "GetFDIPostSaleOrderDetailByIdResult")
    protected FDIPostSaleOrderDetail getFDIPostSaleOrderDetailByIdResult;

    /**
     * 获取getFDIPostSaleOrderDetailByIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIPostSaleOrderDetail }
     *     
     */
    public FDIPostSaleOrderDetail getGetFDIPostSaleOrderDetailByIdResult() {
        return getFDIPostSaleOrderDetailByIdResult;
    }

    /**
     * 设置getFDIPostSaleOrderDetailByIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIPostSaleOrderDetail }
     *     
     */
    public void setGetFDIPostSaleOrderDetailByIdResult(FDIPostSaleOrderDetail value) {
        this.getFDIPostSaleOrderDetailByIdResult = value;
    }

}
