
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
 *         &lt;element name="GetFDIInventorySynBacthByIdResult" type="{http://fanuc.com.cn/}FDIInventorySynBacth" minOccurs="0"/>
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
    "getFDIInventorySynBacthByIdResult"
})
@XmlRootElement(name = "GetFDIInventorySynBacthByIdResponse")
public class GetFDIInventorySynBacthByIdResponse {

    @XmlElement(name = "GetFDIInventorySynBacthByIdResult")
    protected FDIInventorySynBacth getFDIInventorySynBacthByIdResult;

    /**
     * 获取getFDIInventorySynBacthByIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIInventorySynBacth }
     *     
     */
    public FDIInventorySynBacth getGetFDIInventorySynBacthByIdResult() {
        return getFDIInventorySynBacthByIdResult;
    }

    /**
     * 设置getFDIInventorySynBacthByIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIInventorySynBacth }
     *     
     */
    public void setGetFDIInventorySynBacthByIdResult(FDIInventorySynBacth value) {
        this.getFDIInventorySynBacthByIdResult = value;
    }

}
