
package com.avatech.edi.draftorder.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIGetSaleOrder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIGetSaleOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIGetSaleOrder" type="{http://fanuc.com.cn/}FDIGetSaleOrder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIGetSaleOrder", propOrder = {
    "fdiGetSaleOrder"
})
public class ArrayOfFDIGetSaleOrder {

    @XmlElement(name = "FDIGetSaleOrder", nillable = true)
    protected List<FDIGetSaleOrder> fdiGetSaleOrder;

    /**
     * Gets the value of the fdiGetSaleOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiGetSaleOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIGetSaleOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIGetSaleOrder }
     * 
     * 
     */
    public List<FDIGetSaleOrder> getFDIGetSaleOrder() {
        if (fdiGetSaleOrder == null) {
            fdiGetSaleOrder = new ArrayList<FDIGetSaleOrder>();
        }
        return this.fdiGetSaleOrder;
    }

}
