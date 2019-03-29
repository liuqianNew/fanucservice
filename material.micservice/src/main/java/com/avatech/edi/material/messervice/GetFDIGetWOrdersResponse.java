
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
 *         &lt;element name="GetFDIGetWOrdersResult" type="{http://fanuc.com.cn/}ArrayOfFDIGetWOrder" minOccurs="0"/>
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
    "getFDIGetWOrdersResult"
})
@XmlRootElement(name = "GetFDIGetWOrdersResponse")
public class GetFDIGetWOrdersResponse {

    @XmlElement(name = "GetFDIGetWOrdersResult")
    protected ArrayOfFDIGetWOrder getFDIGetWOrdersResult;

    /**
     * 获取getFDIGetWOrdersResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIGetWOrder }
     *     
     */
    public ArrayOfFDIGetWOrder getGetFDIGetWOrdersResult() {
        return getFDIGetWOrdersResult;
    }

    /**
     * 设置getFDIGetWOrdersResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIGetWOrder }
     *     
     */
    public void setGetFDIGetWOrdersResult(ArrayOfFDIGetWOrder value) {
        this.getFDIGetWOrdersResult = value;
    }

}
