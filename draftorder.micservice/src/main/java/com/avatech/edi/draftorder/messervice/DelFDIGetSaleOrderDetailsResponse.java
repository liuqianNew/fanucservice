
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
 *         &lt;element name="DelFDIGetSaleOrderDetailsResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "delFDIGetSaleOrderDetailsResult"
})
@XmlRootElement(name = "DelFDIGetSaleOrderDetailsResponse")
public class DelFDIGetSaleOrderDetailsResponse {

    @XmlElement(name = "DelFDIGetSaleOrderDetailsResult")
    protected boolean delFDIGetSaleOrderDetailsResult;

    /**
     * 获取delFDIGetSaleOrderDetailsResult属性的值。
     * 
     */
    public boolean isDelFDIGetSaleOrderDetailsResult() {
        return delFDIGetSaleOrderDetailsResult;
    }

    /**
     * 设置delFDIGetSaleOrderDetailsResult属性的值。
     * 
     */
    public void setDelFDIGetSaleOrderDetailsResult(boolean value) {
        this.delFDIGetSaleOrderDetailsResult = value;
    }

}
