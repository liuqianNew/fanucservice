
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
 *         &lt;element name="GetFDIGetMaterialInfoByIdResult" type="{http://fanuc.com.cn/}FDIGetMaterialInfo" minOccurs="0"/>
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
    "getFDIGetMaterialInfoByIdResult"
})
@XmlRootElement(name = "GetFDIGetMaterialInfoByIdResponse")
public class GetFDIGetMaterialInfoByIdResponse {

    @XmlElement(name = "GetFDIGetMaterialInfoByIdResult")
    protected FDIGetMaterialInfo getFDIGetMaterialInfoByIdResult;

    /**
     * 获取getFDIGetMaterialInfoByIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIGetMaterialInfo }
     *     
     */
    public FDIGetMaterialInfo getGetFDIGetMaterialInfoByIdResult() {
        return getFDIGetMaterialInfoByIdResult;
    }

    /**
     * 设置getFDIGetMaterialInfoByIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIGetMaterialInfo }
     *     
     */
    public void setGetFDIGetMaterialInfoByIdResult(FDIGetMaterialInfo value) {
        this.getFDIGetMaterialInfoByIdResult = value;
    }

}
