
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
 *         &lt;element name="GetFDIGetRawMaterialDetailByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIGetRawMaterialDetail" minOccurs="0"/>
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
    "getFDIGetRawMaterialDetailByPageResult"
})
@XmlRootElement(name = "GetFDIGetRawMaterialDetailByPageResponse")
public class GetFDIGetRawMaterialDetailByPageResponse {

    @XmlElement(name = "GetFDIGetRawMaterialDetailByPageResult")
    protected ArrayOfFDIGetRawMaterialDetail getFDIGetRawMaterialDetailByPageResult;

    /**
     * 获取getFDIGetRawMaterialDetailByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIGetRawMaterialDetail }
     *     
     */
    public ArrayOfFDIGetRawMaterialDetail getGetFDIGetRawMaterialDetailByPageResult() {
        return getFDIGetRawMaterialDetailByPageResult;
    }

    /**
     * 设置getFDIGetRawMaterialDetailByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIGetRawMaterialDetail }
     *     
     */
    public void setGetFDIGetRawMaterialDetailByPageResult(ArrayOfFDIGetRawMaterialDetail value) {
        this.getFDIGetRawMaterialDetailByPageResult = value;
    }

}
