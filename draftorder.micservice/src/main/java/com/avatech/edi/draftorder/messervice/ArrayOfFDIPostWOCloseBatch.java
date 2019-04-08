
package com.avatech.edi.draftorder.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIPostWOCloseBatch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIPostWOCloseBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIPostWOCloseBatch" type="{http://fanuc.com.cn/}FDIPostWOCloseBatch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIPostWOCloseBatch", propOrder = {
    "fdiPostWOCloseBatch"
})
public class ArrayOfFDIPostWOCloseBatch {

    @XmlElement(name = "FDIPostWOCloseBatch", nillable = true)
    protected List<FDIPostWOCloseBatch> fdiPostWOCloseBatch;

    /**
     * Gets the value of the fdiPostWOCloseBatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiPostWOCloseBatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIPostWOCloseBatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIPostWOCloseBatch }
     * 
     * 
     */
    public List<FDIPostWOCloseBatch> getFDIPostWOCloseBatch() {
        if (fdiPostWOCloseBatch == null) {
            fdiPostWOCloseBatch = new ArrayList<FDIPostWOCloseBatch>();
        }
        return this.fdiPostWOCloseBatch;
    }

}
