
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
 *         &lt;element name="GetFDIGetMaterialDetailByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIGetMaterialDetail" minOccurs="0"/>
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
    "getFDIGetMaterialDetailByPageResult"
})
@XmlRootElement(name = "GetFDIGetMaterialDetailByPageResponse")
public class GetFDIGetMaterialDetailByPageResponse {

    @XmlElement(name = "GetFDIGetMaterialDetailByPageResult")
    protected ArrayOfFDIGetMaterialDetail getFDIGetMaterialDetailByPageResult;

    /**
     * 获取getFDIGetMaterialDetailByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIGetMaterialDetail }
     *     
     */
    public ArrayOfFDIGetMaterialDetail getGetFDIGetMaterialDetailByPageResult() {
        return getFDIGetMaterialDetailByPageResult;
    }

    /**
     * 设置getFDIGetMaterialDetailByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIGetMaterialDetail }
     *     
     */
    public void setGetFDIGetMaterialDetailByPageResult(ArrayOfFDIGetMaterialDetail value) {
        this.getFDIGetMaterialDetailByPageResult = value;
    }

}
