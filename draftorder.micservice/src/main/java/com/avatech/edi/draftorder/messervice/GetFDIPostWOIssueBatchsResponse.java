
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
 *         &lt;element name="GetFDIPostWOIssueBatchsResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostWOIssueBatch" minOccurs="0"/>
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
    "getFDIPostWOIssueBatchsResult"
})
@XmlRootElement(name = "GetFDIPostWOIssueBatchsResponse")
public class GetFDIPostWOIssueBatchsResponse {

    @XmlElement(name = "GetFDIPostWOIssueBatchsResult")
    protected ArrayOfFDIPostWOIssueBatch getFDIPostWOIssueBatchsResult;

    /**
     * 获取getFDIPostWOIssueBatchsResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostWOIssueBatch }
     *     
     */
    public ArrayOfFDIPostWOIssueBatch getGetFDIPostWOIssueBatchsResult() {
        return getFDIPostWOIssueBatchsResult;
    }

    /**
     * 设置getFDIPostWOIssueBatchsResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostWOIssueBatch }
     *     
     */
    public void setGetFDIPostWOIssueBatchsResult(ArrayOfFDIPostWOIssueBatch value) {
        this.getFDIPostWOIssueBatchsResult = value;
    }

}
