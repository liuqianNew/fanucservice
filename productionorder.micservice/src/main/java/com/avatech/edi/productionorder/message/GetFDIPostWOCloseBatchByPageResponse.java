
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
 *         &lt;element name="GetFDIPostWOCloseBatchByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostWOCloseBatch" minOccurs="0"/>
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
    "getFDIPostWOCloseBatchByPageResult"
})
@XmlRootElement(name = "GetFDIPostWOCloseBatchByPageResponse")
public class GetFDIPostWOCloseBatchByPageResponse {

    @XmlElement(name = "GetFDIPostWOCloseBatchByPageResult")
    protected ArrayOfFDIPostWOCloseBatch getFDIPostWOCloseBatchByPageResult;

    /**
     * 获取getFDIPostWOCloseBatchByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostWOCloseBatch }
     *     
     */
    public ArrayOfFDIPostWOCloseBatch getGetFDIPostWOCloseBatchByPageResult() {
        return getFDIPostWOCloseBatchByPageResult;
    }

    /**
     * 设置getFDIPostWOCloseBatchByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostWOCloseBatch }
     *     
     */
    public void setGetFDIPostWOCloseBatchByPageResult(ArrayOfFDIPostWOCloseBatch value) {
        this.getFDIPostWOCloseBatchByPageResult = value;
    }

}
