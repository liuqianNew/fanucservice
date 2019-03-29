
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
 *         &lt;element name="mFDIInventorySynBacth" type="{http://fanuc.com.cn/}FDIInventorySynBacth" minOccurs="0"/>
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
    "mfdiInventorySynBacth"
})
@XmlRootElement(name = "AddFDIInventorySynBacth")
public class AddFDIInventorySynBacth {

    @XmlElement(name = "mFDIInventorySynBacth")
    protected FDIInventorySynBacth mfdiInventorySynBacth;

    /**
     * 获取mfdiInventorySynBacth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIInventorySynBacth }
     *     
     */
    public FDIInventorySynBacth getMFDIInventorySynBacth() {
        return mfdiInventorySynBacth;
    }

    /**
     * 设置mfdiInventorySynBacth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIInventorySynBacth }
     *     
     */
    public void setMFDIInventorySynBacth(FDIInventorySynBacth value) {
        this.mfdiInventorySynBacth = value;
    }

}
