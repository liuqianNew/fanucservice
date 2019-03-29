
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
 *         &lt;element name="GetFDIGetRawMaterialDetailsResult" type="{http://fanuc.com.cn/}ArrayOfFDIGetRawMaterialDetail" minOccurs="0"/>
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
    "getFDIGetRawMaterialDetailsResult"
})
@XmlRootElement(name = "GetFDIGetRawMaterialDetailsResponse")
public class GetFDIGetRawMaterialDetailsResponse {

    @XmlElement(name = "GetFDIGetRawMaterialDetailsResult")
    protected ArrayOfFDIGetRawMaterialDetail getFDIGetRawMaterialDetailsResult;

    /**
     * 获取getFDIGetRawMaterialDetailsResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIGetRawMaterialDetail }
     *     
     */
    public ArrayOfFDIGetRawMaterialDetail getGetFDIGetRawMaterialDetailsResult() {
        return getFDIGetRawMaterialDetailsResult;
    }

    /**
     * 设置getFDIGetRawMaterialDetailsResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIGetRawMaterialDetail }
     *     
     */
    public void setGetFDIGetRawMaterialDetailsResult(ArrayOfFDIGetRawMaterialDetail value) {
        this.getFDIGetRawMaterialDetailsResult = value;
    }

}
