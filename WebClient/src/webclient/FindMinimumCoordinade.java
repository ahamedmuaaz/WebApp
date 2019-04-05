
package webclient;

import webclient.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findMinimumCoordinade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findMinimumCoordinade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="point2d" type="{http://Server/}point2D" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findMinimumCoordinade", propOrder = {
    "point2D"
})
public class FindMinimumCoordinade {

    @XmlElement(name = "point2d")
    protected Point2D point2D;

    /**
     * Gets the value of the point2D property.
     * 
     * @return
     *     possible object is
     *     {@link Point2D }
     *     
     */
    public Point2D getPoint2D() {
        return point2D;
    }

    /**
     * Sets the value of the point2D property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point2D }
     *     
     */
    public void setPoint2D(Point2D value) {
        this.point2D = value;
    }

}
