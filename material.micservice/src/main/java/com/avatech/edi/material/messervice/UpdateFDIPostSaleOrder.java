
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
 *         &lt;element name="mFDIPostSaleOrder" type="{http://fanuc.com.cn/}FDIPostSaleOrder" minOccurs="0"/>
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
    "mfdiPostSaleOrder"
})
@XmlRootElement(name = "UpdateFDIPostSaleOrder")
public class UpdateFDIPostSaleOrder {

    @XmlElement(name = "mFDIPostSaleOrder")
    protected FDIPostSaleOrder mfdiPostSaleOrder;

    /**
     * 获取mfdiPostSaleOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIPostSaleOrder }
     *     
     */
    public FDIPostSaleOrder getMFDIPostSaleOrder() {
        return mfdiPostSaleOrder;
    }

    /**
     * 设置mfdiPostSaleOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIPostSaleOrder }
     *     
     */
    public void setMFDIPostSaleOrder(FDIPostSaleOrder value) {
        this.mfdiPostSaleOrder = value;
    }

}
