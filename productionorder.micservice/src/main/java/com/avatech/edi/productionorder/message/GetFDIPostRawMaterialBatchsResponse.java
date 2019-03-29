
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
 *         &lt;element name="GetFDIPostRawMaterialBatchsResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostRawMaterialBatch" minOccurs="0"/>
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
    "getFDIPostRawMaterialBatchsResult"
})
@XmlRootElement(name = "GetFDIPostRawMaterialBatchsResponse")
public class GetFDIPostRawMaterialBatchsResponse {

    @XmlElement(name = "GetFDIPostRawMaterialBatchsResult")
    protected ArrayOfFDIPostRawMaterialBatch getFDIPostRawMaterialBatchsResult;

    /**
     * 获取getFDIPostRawMaterialBatchsResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostRawMaterialBatch }
     *     
     */
    public ArrayOfFDIPostRawMaterialBatch getGetFDIPostRawMaterialBatchsResult() {
        return getFDIPostRawMaterialBatchsResult;
    }

    /**
     * 设置getFDIPostRawMaterialBatchsResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostRawMaterialBatch }
     *     
     */
    public void setGetFDIPostRawMaterialBatchsResult(ArrayOfFDIPostRawMaterialBatch value) {
        this.getFDIPostRawMaterialBatchsResult = value;
    }

}
