
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
 *         &lt;element name="GetFDIPostWOCloseByIdResult" type="{http://fanuc.com.cn/}FDIPostWOClose" minOccurs="0"/>
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
    "getFDIPostWOCloseByIdResult"
})
@XmlRootElement(name = "GetFDIPostWOCloseByIdResponse")
public class GetFDIPostWOCloseByIdResponse {

    @XmlElement(name = "GetFDIPostWOCloseByIdResult")
    protected FDIPostWOClose getFDIPostWOCloseByIdResult;

    /**
     * 获取getFDIPostWOCloseByIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIPostWOClose }
     *     
     */
    public FDIPostWOClose getGetFDIPostWOCloseByIdResult() {
        return getFDIPostWOCloseByIdResult;
    }

    /**
     * 设置getFDIPostWOCloseByIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIPostWOClose }
     *     
     */
    public void setGetFDIPostWOCloseByIdResult(FDIPostWOClose value) {
        this.getFDIPostWOCloseByIdResult = value;
    }

}
