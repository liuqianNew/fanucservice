
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
 *         &lt;element name="GetFDIGetSaleOrderByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIGetSaleOrder" minOccurs="0"/>
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
    "getFDIGetSaleOrderByPageResult"
})
@XmlRootElement(name = "GetFDIGetSaleOrderByPageResponse")
public class GetFDIGetSaleOrderByPageResponse {

    @XmlElement(name = "GetFDIGetSaleOrderByPageResult")
    protected ArrayOfFDIGetSaleOrder getFDIGetSaleOrderByPageResult;

    /**
     * 获取getFDIGetSaleOrderByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIGetSaleOrder }
     *     
     */
    public ArrayOfFDIGetSaleOrder getGetFDIGetSaleOrderByPageResult() {
        return getFDIGetSaleOrderByPageResult;
    }

    /**
     * 设置getFDIGetSaleOrderByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIGetSaleOrder }
     *     
     */
    public void setGetFDIGetSaleOrderByPageResult(ArrayOfFDIGetSaleOrder value) {
        this.getFDIGetSaleOrderByPageResult = value;
    }

}
