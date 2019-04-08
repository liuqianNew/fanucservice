
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
 *         &lt;element name="GetFDIPostRawMaterialDetailByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostRawMaterialDetail" minOccurs="0"/>
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
    "getFDIPostRawMaterialDetailByPageResult"
})
@XmlRootElement(name = "GetFDIPostRawMaterialDetailByPageResponse")
public class GetFDIPostRawMaterialDetailByPageResponse {

    @XmlElement(name = "GetFDIPostRawMaterialDetailByPageResult")
    protected ArrayOfFDIPostRawMaterialDetail getFDIPostRawMaterialDetailByPageResult;

    /**
     * 获取getFDIPostRawMaterialDetailByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostRawMaterialDetail }
     *     
     */
    public ArrayOfFDIPostRawMaterialDetail getGetFDIPostRawMaterialDetailByPageResult() {
        return getFDIPostRawMaterialDetailByPageResult;
    }

    /**
     * 设置getFDIPostRawMaterialDetailByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostRawMaterialDetail }
     *     
     */
    public void setGetFDIPostRawMaterialDetailByPageResult(ArrayOfFDIPostRawMaterialDetail value) {
        this.getFDIPostRawMaterialDetailByPageResult = value;
    }

}
