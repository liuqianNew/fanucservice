
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
 *         &lt;element name="mFDIGetSaleOrderDetail" type="{http://fanuc.com.cn/}FDIGetSaleOrderDetail" minOccurs="0"/>
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
    "mfdiGetSaleOrderDetail"
})
@XmlRootElement(name = "UpdateFDIGetSaleOrderDetail")
public class UpdateFDIGetSaleOrderDetail {

    @XmlElement(name = "mFDIGetSaleOrderDetail")
    protected FDIGetSaleOrderDetail mfdiGetSaleOrderDetail;

    /**
     * 获取mfdiGetSaleOrderDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIGetSaleOrderDetail }
     *     
     */
    public FDIGetSaleOrderDetail getMFDIGetSaleOrderDetail() {
        return mfdiGetSaleOrderDetail;
    }

    /**
     * 设置mfdiGetSaleOrderDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIGetSaleOrderDetail }
     *     
     */
    public void setMFDIGetSaleOrderDetail(FDIGetSaleOrderDetail value) {
        this.mfdiGetSaleOrderDetail = value;
    }

}
