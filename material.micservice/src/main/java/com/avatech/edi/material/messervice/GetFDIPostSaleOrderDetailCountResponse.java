
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
 *         &lt;element name="GetFDIPostSaleOrderDetailCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getFDIPostSaleOrderDetailCountResult"
})
@XmlRootElement(name = "GetFDIPostSaleOrderDetailCountResponse")
public class GetFDIPostSaleOrderDetailCountResponse {

    @XmlElement(name = "GetFDIPostSaleOrderDetailCountResult")
    protected int getFDIPostSaleOrderDetailCountResult;

    /**
     * 获取getFDIPostSaleOrderDetailCountResult属性的值。
     * 
     */
    public int getGetFDIPostSaleOrderDetailCountResult() {
        return getFDIPostSaleOrderDetailCountResult;
    }

    /**
     * 设置getFDIPostSaleOrderDetailCountResult属性的值。
     * 
     */
    public void setGetFDIPostSaleOrderDetailCountResult(int value) {
        this.getFDIPostSaleOrderDetailCountResult = value;
    }

}
