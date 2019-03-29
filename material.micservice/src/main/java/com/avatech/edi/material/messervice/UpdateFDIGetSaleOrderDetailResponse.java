
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
 *         &lt;element name="UpdateFDIGetSaleOrderDetailResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateFDIGetSaleOrderDetailResult"
})
@XmlRootElement(name = "UpdateFDIGetSaleOrderDetailResponse")
public class UpdateFDIGetSaleOrderDetailResponse {

    @XmlElement(name = "UpdateFDIGetSaleOrderDetailResult")
    protected boolean updateFDIGetSaleOrderDetailResult;

    /**
     * 获取updateFDIGetSaleOrderDetailResult属性的值。
     * 
     */
    public boolean isUpdateFDIGetSaleOrderDetailResult() {
        return updateFDIGetSaleOrderDetailResult;
    }

    /**
     * 设置updateFDIGetSaleOrderDetailResult属性的值。
     * 
     */
    public void setUpdateFDIGetSaleOrderDetailResult(boolean value) {
        this.updateFDIGetSaleOrderDetailResult = value;
    }

}
