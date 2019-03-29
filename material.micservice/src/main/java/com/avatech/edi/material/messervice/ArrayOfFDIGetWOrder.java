
package com.avatech.edi.material.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIGetWOrder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIGetWOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIGetWOrder" type="{http://fanuc.com.cn/}FDIGetWOrder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIGetWOrder", propOrder = {
    "fdiGetWOrder"
})
public class ArrayOfFDIGetWOrder {

    @XmlElement(name = "FDIGetWOrder", nillable = true)
    protected List<FDIGetWOrder> fdiGetWOrder;

    /**
     * Gets the value of the fdiGetWOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiGetWOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIGetWOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIGetWOrder }
     * 
     * 
     */
    public List<FDIGetWOrder> getFDIGetWOrder() {
        if (fdiGetWOrder == null) {
            fdiGetWOrder = new ArrayList<FDIGetWOrder>();
        }
        return this.fdiGetWOrder;
    }

}
