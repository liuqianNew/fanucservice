
package com.avatech.edi.material.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIPostSaleOrderBatch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIPostSaleOrderBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIPostSaleOrderBatch" type="{http://fanuc.com.cn/}FDIPostSaleOrderBatch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIPostSaleOrderBatch", propOrder = {
    "fdiPostSaleOrderBatch"
})
public class ArrayOfFDIPostSaleOrderBatch {

    @XmlElement(name = "FDIPostSaleOrderBatch", nillable = true)
    protected List<FDIPostSaleOrderBatch> fdiPostSaleOrderBatch;

    /**
     * Gets the value of the fdiPostSaleOrderBatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiPostSaleOrderBatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIPostSaleOrderBatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIPostSaleOrderBatch }
     * 
     * 
     */
    public List<FDIPostSaleOrderBatch> getFDIPostSaleOrderBatch() {
        if (fdiPostSaleOrderBatch == null) {
            fdiPostSaleOrderBatch = new ArrayList<FDIPostSaleOrderBatch>();
        }
        return this.fdiPostSaleOrderBatch;
    }

}
