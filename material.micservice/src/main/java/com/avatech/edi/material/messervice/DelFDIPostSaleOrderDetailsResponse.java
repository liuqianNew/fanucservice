
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
 *         &lt;element name="DelFDIPostSaleOrderDetailsResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "delFDIPostSaleOrderDetailsResult"
})
@XmlRootElement(name = "DelFDIPostSaleOrderDetailsResponse")
public class DelFDIPostSaleOrderDetailsResponse {

    @XmlElement(name = "DelFDIPostSaleOrderDetailsResult")
    protected boolean delFDIPostSaleOrderDetailsResult;

    /**
     * 获取delFDIPostSaleOrderDetailsResult属性的值。
     * 
     */
    public boolean isDelFDIPostSaleOrderDetailsResult() {
        return delFDIPostSaleOrderDetailsResult;
    }

    /**
     * 设置delFDIPostSaleOrderDetailsResult属性的值。
     * 
     */
    public void setDelFDIPostSaleOrderDetailsResult(boolean value) {
        this.delFDIPostSaleOrderDetailsResult = value;
    }

}
