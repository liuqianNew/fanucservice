
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
 *         &lt;element name="mFDIGetWOrder" type="{http://fanuc.com.cn/}FDIGetWOrder" minOccurs="0"/>
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
    "mfdiGetWOrder"
})
@XmlRootElement(name = "AddFDIGetWOrder")
public class AddFDIGetWOrder {

    @XmlElement(name = "mFDIGetWOrder")
    protected FDIGetWOrder mfdiGetWOrder;

    /**
     * 获取mfdiGetWOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIGetWOrder }
     *     
     */
    public FDIGetWOrder getMFDIGetWOrder() {
        return mfdiGetWOrder;
    }

    /**
     * 设置mfdiGetWOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIGetWOrder }
     *     
     */
    public void setMFDIGetWOrder(FDIGetWOrder value) {
        this.mfdiGetWOrder = value;
    }

}
