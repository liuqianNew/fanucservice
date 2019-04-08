
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
 *         &lt;element name="GetFDIPostRawMaterialBatchByIdResult" type="{http://fanuc.com.cn/}FDIPostRawMaterialBatch" minOccurs="0"/>
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
    "getFDIPostRawMaterialBatchByIdResult"
})
@XmlRootElement(name = "GetFDIPostRawMaterialBatchByIdResponse")
public class GetFDIPostRawMaterialBatchByIdResponse {

    @XmlElement(name = "GetFDIPostRawMaterialBatchByIdResult")
    protected FDIPostRawMaterialBatch getFDIPostRawMaterialBatchByIdResult;

    /**
     * 获取getFDIPostRawMaterialBatchByIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FDIPostRawMaterialBatch }
     *     
     */
    public FDIPostRawMaterialBatch getGetFDIPostRawMaterialBatchByIdResult() {
        return getFDIPostRawMaterialBatchByIdResult;
    }

    /**
     * 设置getFDIPostRawMaterialBatchByIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FDIPostRawMaterialBatch }
     *     
     */
    public void setGetFDIPostRawMaterialBatchByIdResult(FDIPostRawMaterialBatch value) {
        this.getFDIPostRawMaterialBatchByIdResult = value;
    }

}
