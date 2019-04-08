
package com.avatech.edi.draftorder.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIPostWOClose complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIPostWOClose">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIPostWOClose" type="{http://fanuc.com.cn/}FDIPostWOClose" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIPostWOClose", propOrder = {
    "fdiPostWOClose"
})
public class ArrayOfFDIPostWOClose {

    @XmlElement(name = "FDIPostWOClose", nillable = true)
    protected List<FDIPostWOClose> fdiPostWOClose;

    /**
     * Gets the value of the fdiPostWOClose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiPostWOClose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIPostWOClose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIPostWOClose }
     * 
     * 
     */
    public List<FDIPostWOClose> getFDIPostWOClose() {
        if (fdiPostWOClose == null) {
            fdiPostWOClose = new ArrayList<FDIPostWOClose>();
        }
        return this.fdiPostWOClose;
    }

}
