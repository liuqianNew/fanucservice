
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
 *         &lt;element name="GetFDIPostWOCloseDetailCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getFDIPostWOCloseDetailCountResult"
})
@XmlRootElement(name = "GetFDIPostWOCloseDetailCountResponse")
public class GetFDIPostWOCloseDetailCountResponse {

    @XmlElement(name = "GetFDIPostWOCloseDetailCountResult")
    protected int getFDIPostWOCloseDetailCountResult;

    /**
     * 获取getFDIPostWOCloseDetailCountResult属性的值。
     * 
     */
    public int getGetFDIPostWOCloseDetailCountResult() {
        return getFDIPostWOCloseDetailCountResult;
    }

    /**
     * 设置getFDIPostWOCloseDetailCountResult属性的值。
     * 
     */
    public void setGetFDIPostWOCloseDetailCountResult(int value) {
        this.getFDIPostWOCloseDetailCountResult = value;
    }

}
