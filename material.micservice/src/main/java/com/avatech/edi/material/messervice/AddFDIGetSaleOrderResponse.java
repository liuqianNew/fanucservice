
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
 *         &lt;element name="AddFDIGetSaleOrderResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addFDIGetSaleOrderResult"
})
@XmlRootElement(name = "AddFDIGetSaleOrderResponse")
public class AddFDIGetSaleOrderResponse {

    @XmlElement(name = "AddFDIGetSaleOrderResult")
    protected boolean addFDIGetSaleOrderResult;

    /**
     * 获取addFDIGetSaleOrderResult属性的值。
     * 
     */
    public boolean isAddFDIGetSaleOrderResult() {
        return addFDIGetSaleOrderResult;
    }

    /**
     * 设置addFDIGetSaleOrderResult属性的值。
     * 
     */
    public void setAddFDIGetSaleOrderResult(boolean value) {
        this.addFDIGetSaleOrderResult = value;
    }

}
