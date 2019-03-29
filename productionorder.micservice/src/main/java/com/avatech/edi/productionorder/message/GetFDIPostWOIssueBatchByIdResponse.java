
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
 *         &lt;element name="GetFDIPostWOIssueBatchByIdResult" type="{http://fanuc.com.cn/}FDIPostWOIssueBatch" minOccurs="0"/>
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
    "getFDIPostWOIssueBatchByIdResult"
})
@XmlRootElement(name = "GetFDIPostWOIssueBatchByIdResponse")
public class GetFDIPostWOIssueBatchByIdResponse {

    @XmlElement(name = "GetFDIPostWOIssueBatchByIdResult")
    protected FDIPostWOIssueBatch getFDIPostWOIssueBatchByIdResult;

    /**
     * 获取getFDIPostWOIssueBatchByIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIPostWOIssueBatch }
     *     
     */
    public FDIPostWOIssueBatch getGetFDIPostWOIssueBatchByIdResult() {
        return getFDIPostWOIssueBatchByIdResult;
    }

    /**
     * 设置getFDIPostWOIssueBatchByIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIPostWOIssueBatch }
     *     
     */
    public void setGetFDIPostWOIssueBatchByIdResult(FDIPostWOIssueBatch value) {
        this.getFDIPostWOIssueBatchByIdResult = value;
    }

}
