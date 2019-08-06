
package com.avatech.edi.productionorder.message;

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
 *         &lt;element name="DelFDIGetSaleOrderDetailResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "delFDIGetSaleOrderDetailResult"
})
@XmlRootElement(name = "DelFDIGetSaleOrderDetailResponse")
public class DelFDIGetSaleOrderDetailResponse {

    @XmlElement(name = "DelFDIGetSaleOrderDetailResult")
    protected boolean delFDIGetSaleOrderDetailResult;

    /**
     * 获取delFDIGetSaleOrderDetailResult属性的值。
     * 
     */
    public boolean isDelFDIGetSaleOrderDetailResult() {
        return delFDIGetSaleOrderDetailResult;
    }

    /**
     * 设置delFDIGetSaleOrderDetailResult属性的值。
     * 
     */
    public void setDelFDIGetSaleOrderDetailResult(boolean value) {
        this.delFDIGetSaleOrderDetailResult = value;
    }

}