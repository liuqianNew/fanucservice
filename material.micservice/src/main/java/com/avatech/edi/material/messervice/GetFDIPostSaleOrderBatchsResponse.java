
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
 *         &lt;element name="GetFDIPostSaleOrderBatchsResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostSaleOrderBatch" minOccurs="0"/>
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
    "getFDIPostSaleOrderBatchsResult"
})
@XmlRootElement(name = "GetFDIPostSaleOrderBatchsResponse")
public class GetFDIPostSaleOrderBatchsResponse {

    @XmlElement(name = "GetFDIPostSaleOrderBatchsResult")
    protected ArrayOfFDIPostSaleOrderBatch getFDIPostSaleOrderBatchsResult;

    /**
     * 获取getFDIPostSaleOrderBatchsResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostSaleOrderBatch }
     *     
     */
    public ArrayOfFDIPostSaleOrderBatch getGetFDIPostSaleOrderBatchsResult() {
        return getFDIPostSaleOrderBatchsResult;
    }

    /**
     * 设置getFDIPostSaleOrderBatchsResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostSaleOrderBatch }
     *     
     */
    public void setGetFDIPostSaleOrderBatchsResult(ArrayOfFDIPostSaleOrderBatch value) {
        this.getFDIPostSaleOrderBatchsResult = value;
    }

}
