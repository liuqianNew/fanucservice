
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
 *         &lt;element name="GetFDIGetSaleOrderDetailByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIGetSaleOrderDetail" minOccurs="0"/>
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
    "getFDIGetSaleOrderDetailByPageResult"
})
@XmlRootElement(name = "GetFDIGetSaleOrderDetailByPageResponse")
public class GetFDIGetSaleOrderDetailByPageResponse {

    @XmlElement(name = "GetFDIGetSaleOrderDetailByPageResult")
    protected ArrayOfFDIGetSaleOrderDetail getFDIGetSaleOrderDetailByPageResult;

    /**
     * 获取getFDIGetSaleOrderDetailByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIGetSaleOrderDetail }
     *     
     */
    public ArrayOfFDIGetSaleOrderDetail getGetFDIGetSaleOrderDetailByPageResult() {
        return getFDIGetSaleOrderDetailByPageResult;
    }

    /**
     * 设置getFDIGetSaleOrderDetailByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIGetSaleOrderDetail }
     *     
     */
    public void setGetFDIGetSaleOrderDetailByPageResult(ArrayOfFDIGetSaleOrderDetail value) {
        this.getFDIGetSaleOrderDetailByPageResult = value;
    }

}
