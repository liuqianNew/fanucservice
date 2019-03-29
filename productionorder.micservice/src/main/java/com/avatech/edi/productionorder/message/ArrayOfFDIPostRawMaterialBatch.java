
package com.avatech.edi.productionorder.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIPostRawMaterialBatch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIPostRawMaterialBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIPostRawMaterialBatch" type="{http://fanuc.com.cn/}FDIPostRawMaterialBatch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIPostRawMaterialBatch", propOrder = {
    "fdiPostRawMaterialBatch"
})
public class ArrayOfFDIPostRawMaterialBatch {

    @XmlElement(name = "FDIPostRawMaterialBatch", nillable = true)
    protected List<FDIPostRawMaterialBatch> fdiPostRawMaterialBatch;

    /**
     * Gets the value of the fdiPostRawMaterialBatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiPostRawMaterialBatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIPostRawMaterialBatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIPostRawMaterialBatch }
     * 
     * 
     */
    public List<FDIPostRawMaterialBatch> getFDIPostRawMaterialBatch() {
        if (fdiPostRawMaterialBatch == null) {
            fdiPostRawMaterialBatch = new ArrayList<FDIPostRawMaterialBatch>();
        }
        return this.fdiPostRawMaterialBatch;
    }

}
