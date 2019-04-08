
package com.avatech.edi.draftorder.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIInventorySynBacth complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIInventorySynBacth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIInventorySynBacth" type="{http://fanuc.com.cn/}FDIInventorySynBacth" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIInventorySynBacth", propOrder = {
    "fdiInventorySynBacth"
})
public class ArrayOfFDIInventorySynBacth {

    @XmlElement(name = "FDIInventorySynBacth", nillable = true)
    protected List<FDIInventorySynBacth> fdiInventorySynBacth;

    /**
     * Gets the value of the fdiInventorySynBacth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiInventorySynBacth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIInventorySynBacth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIInventorySynBacth }
     * 
     * 
     */
    public List<FDIInventorySynBacth> getFDIInventorySynBacth() {
        if (fdiInventorySynBacth == null) {
            fdiInventorySynBacth = new ArrayList<FDIInventorySynBacth>();
        }
        return this.fdiInventorySynBacth;
    }

}
