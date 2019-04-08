
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
 *         &lt;element name="GetFDIPostWOIssueBatchByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostWOIssueBatch" minOccurs="0"/>
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
    "getFDIPostWOIssueBatchByPageResult"
})
@XmlRootElement(name = "GetFDIPostWOIssueBatchByPageResponse")
public class GetFDIPostWOIssueBatchByPageResponse {

    @XmlElement(name = "GetFDIPostWOIssueBatchByPageResult")
    protected ArrayOfFDIPostWOIssueBatch getFDIPostWOIssueBatchByPageResult;

    /**
     * 获取getFDIPostWOIssueBatchByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostWOIssueBatch }
     *     
     */
    public ArrayOfFDIPostWOIssueBatch getGetFDIPostWOIssueBatchByPageResult() {
        return getFDIPostWOIssueBatchByPageResult;
    }

    /**
     * 设置getFDIPostWOIssueBatchByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostWOIssueBatch }
     *     
     */
    public void setGetFDIPostWOIssueBatchByPageResult(ArrayOfFDIPostWOIssueBatch value) {
        this.getFDIPostWOIssueBatchByPageResult = value;
    }

}
