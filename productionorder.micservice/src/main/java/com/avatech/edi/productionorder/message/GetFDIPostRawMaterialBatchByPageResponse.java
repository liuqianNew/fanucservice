
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
 *         &lt;element name="GetFDIPostRawMaterialBatchByPageResult" type="{http://fanuc.com.cn/}ArrayOfFDIPostRawMaterialBatch" minOccurs="0"/>
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
    "getFDIPostRawMaterialBatchByPageResult"
})
@XmlRootElement(name = "GetFDIPostRawMaterialBatchByPageResponse")
public class GetFDIPostRawMaterialBatchByPageResponse {

    @XmlElement(name = "GetFDIPostRawMaterialBatchByPageResult")
    protected ArrayOfFDIPostRawMaterialBatch getFDIPostRawMaterialBatchByPageResult;

    /**
     * 获取getFDIPostRawMaterialBatchByPageResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDIPostRawMaterialBatch }
     *     
     */
    public ArrayOfFDIPostRawMaterialBatch getGetFDIPostRawMaterialBatchByPageResult() {
        return getFDIPostRawMaterialBatchByPageResult;
    }

    /**
     * 设置getFDIPostRawMaterialBatchByPageResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDIPostRawMaterialBatch }
     *     
     */
    public void setGetFDIPostRawMaterialBatchByPageResult(ArrayOfFDIPostRawMaterialBatch value) {
        this.getFDIPostRawMaterialBatchByPageResult = value;
    }

}
