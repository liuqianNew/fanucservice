
package com.avatech.edi.draftorder.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIPostSaleOrder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIPostSaleOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIPostSaleOrder" type="{http://fanuc.com.cn/}FDIPostSaleOrder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIPostSaleOrder", propOrder = {
    "fdiPostSaleOrder"
})
public class ArrayOfFDIPostSaleOrder {

    @XmlElement(name = "FDIPostSaleOrder", nillable = true)
    protected List<FDIPostSaleOrder> fdiPostSaleOrder;

    /**
     * Gets the value of the fdiPostSaleOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiPostSaleOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIPostSaleOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIPostSaleOrder }
     * 
     * 
     */
    public List<FDIPostSaleOrder> getFDIPostSaleOrder() {
        if (fdiPostSaleOrder == null) {
            fdiPostSaleOrder = new ArrayList<FDIPostSaleOrder>();
        }
        return this.fdiPostSaleOrder;
    }

}
