
package com.avatech.edi.draftorder.messervice;

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
 *         &lt;element name="GetFDIPostSaleOrderDetailByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostSaleOrderDetail" minOccurs="0"/>
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
    "getFDIPostSaleOrderDetailByPageResult"
})
@XmlRootElement(name = "GetFDIPostSaleOrderDetailByPageResponse")
public class GetFDIPostSaleOrderDetailByPageResponse {

    @XmlElement(name = "GetFDIPostSaleOrderDetailByPageResult")
    protected ArrayOfFDIPostSaleOrderDetail getFDIPostSaleOrderDetailByPageResult;

    /**
     * 获取getFDIPostSaleOrderDetailByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostSaleOrderDetail }
     *     
     */
    public ArrayOfFDIPostSaleOrderDetail getGetFDIPostSaleOrderDetailByPageResult() {
        return getFDIPostSaleOrderDetailByPageResult;
    }

    /**
     * 设置getFDIPostSaleOrderDetailByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostSaleOrderDetail }
     *     
     */
    public void setGetFDIPostSaleOrderDetailByPageResult(ArrayOfFDIPostSaleOrderDetail value) {
        this.getFDIPostSaleOrderDetailByPageResult = value;
    }

}
