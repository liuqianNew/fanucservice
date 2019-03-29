
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
 *         &lt;element name="DelFDIPostSaleOrdersResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "delFDIPostSaleOrdersResult"
})
@XmlRootElement(name = "DelFDIPostSaleOrdersResponse")
public class DelFDIPostSaleOrdersResponse {

    @XmlElement(name = "DelFDIPostSaleOrdersResult")
    protected boolean delFDIPostSaleOrdersResult;

    /**
     * 获取delFDIPostSaleOrdersResult属性的值。
     * 
     */
    public boolean isDelFDIPostSaleOrdersResult() {
        return delFDIPostSaleOrdersResult;
    }

    /**
     * 设置delFDIPostSaleOrdersResult属性的值。
     * 
     */
    public void setDelFDIPostSaleOrdersResult(boolean value) {
        this.delFDIPostSaleOrdersResult = value;
    }

}
