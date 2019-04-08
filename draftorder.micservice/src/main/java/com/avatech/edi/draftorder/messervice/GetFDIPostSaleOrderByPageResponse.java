
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
 *         &lt;element name="GetFDIPostSaleOrderByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostSaleOrder" minOccurs="0"/>
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
    "getFDIPostSaleOrderByPageResult"
})
@XmlRootElement(name = "GetFDIPostSaleOrderByPageResponse")
public class GetFDIPostSaleOrderByPageResponse {

    @XmlElement(name = "GetFDIPostSaleOrderByPageResult")
    protected ArrayOfFDIPostSaleOrder getFDIPostSaleOrderByPageResult;

    /**
     * 获取getFDIPostSaleOrderByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostSaleOrder }
     *     
     */
    public ArrayOfFDIPostSaleOrder getGetFDIPostSaleOrderByPageResult() {
        return getFDIPostSaleOrderByPageResult;
    }

    /**
     * 设置getFDIPostSaleOrderByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostSaleOrder }
     *     
     */
    public void setGetFDIPostSaleOrderByPageResult(ArrayOfFDIPostSaleOrder value) {
        this.getFDIPostSaleOrderByPageResult = value;
    }

}
