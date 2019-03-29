
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
 *         &lt;element name="GetFDIGetSaleOrderDetailCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getFDIGetSaleOrderDetailCountResult"
})
@XmlRootElement(name = "GetFDIGetSaleOrderDetailCountResponse")
public class GetFDIGetSaleOrderDetailCountResponse {

    @XmlElement(name = "GetFDIGetSaleOrderDetailCountResult")
    protected int getFDIGetSaleOrderDetailCountResult;

    /**
     * 获取getFDIGetSaleOrderDetailCountResult属性的值。
     * 
     */
    public int getGetFDIGetSaleOrderDetailCountResult() {
        return getFDIGetSaleOrderDetailCountResult;
    }

    /**
     * 设置getFDIGetSaleOrderDetailCountResult属性的值。
     * 
     */
    public void setGetFDIGetSaleOrderDetailCountResult(int value) {
        this.getFDIGetSaleOrderDetailCountResult = value;
    }

}
