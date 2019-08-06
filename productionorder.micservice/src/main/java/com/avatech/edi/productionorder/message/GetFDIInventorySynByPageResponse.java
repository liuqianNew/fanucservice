
package com.avatech.edi.productionorder.message;

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
 *         &lt;element name="GetFDIInventorySynByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIInventorySyn" minOccurs="0"/>
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
    "getFDIInventorySynByPageResult"
})
@XmlRootElement(name = "GetFDIInventorySynByPageResponse")
public class GetFDIInventorySynByPageResponse {

    @XmlElement(name = "GetFDIInventorySynByPageResult")
    protected ArrayOfFDIInventorySyn getFDIInventorySynByPageResult;

    /**
     * 获取getFDIInventorySynByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIInventorySyn }
     *     
     */
    public ArrayOfFDIInventorySyn getGetFDIInventorySynByPageResult() {
        return getFDIInventorySynByPageResult;
    }

    /**
     * 设置getFDIInventorySynByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIInventorySyn }
     *     
     */
    public void setGetFDIInventorySynByPageResult(ArrayOfFDIInventorySyn value) {
        this.getFDIInventorySynByPageResult = value;
    }

}