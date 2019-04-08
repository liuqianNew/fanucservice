
package com.avatech.edi.draftorder.messervice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFDIPostWOIssue complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDIPostWOIssue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDIPostWOIssue" type="{http://fanuc.com.cn/}FDIPostWOIssue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDIPostWOIssue", propOrder = {
    "fdiPostWOIssue"
})
public class ArrayOfFDIPostWOIssue {

    @XmlElement(name = "FDIPostWOIssue", nillable = true)
    protected List<FDIPostWOIssue> fdiPostWOIssue;

    /**
     * Gets the value of the fdiPostWOIssue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdiPostWOIssue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDIPostWOIssue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDIPostWOIssue }
     * 
     * 
     */
    public List<FDIPostWOIssue> getFDIPostWOIssue() {
        if (fdiPostWOIssue == null) {
            fdiPostWOIssue = new ArrayList<FDIPostWOIssue>();
        }
        return this.fdiPostWOIssue;
    }

}
