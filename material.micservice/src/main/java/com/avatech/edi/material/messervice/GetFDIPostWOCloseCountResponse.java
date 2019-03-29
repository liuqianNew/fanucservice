
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
 *         &lt;element name="GetFDIPostWOCloseCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getFDIPostWOCloseCountResult"
})
@XmlRootElement(name = "GetFDIPostWOCloseCountResponse")
public class GetFDIPostWOCloseCountResponse {

    @XmlElement(name = "GetFDIPostWOCloseCountResult")
    protected int getFDIPostWOCloseCountResult;

    /**
     * 获取getFDIPostWOCloseCountResult属性的值。
     * 
     */
    public int getGetFDIPostWOCloseCountResult() {
        return getFDIPostWOCloseCountResult;
    }

    /**
     * 设置getFDIPostWOCloseCountResult属性的值。
     * 
     */
    public void setGetFDIPostWOCloseCountResult(int value) {
        this.getFDIPostWOCloseCountResult = value;
    }

}
