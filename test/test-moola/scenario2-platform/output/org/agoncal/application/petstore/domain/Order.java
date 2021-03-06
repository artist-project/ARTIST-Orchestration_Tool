/*******************************************************************************
 * File generated from the petstore-app::org::agoncal::application::petstore::domain::Order uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 04. September 2015 10:00:13 MESZ
 *******************************************************************************/
package org.agoncal.application.petstore.domain;

import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.Ref;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.agoncal.application.petstore.domain.Address;
import org.agoncal.application.petstore.domain.CreditCard;
import org.agoncal.application.petstore.domain.Customer;
import org.agoncal.application.petstore.domain.OrderLine;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Order.
 * 
 * @author 
 */
@Entity
public class Order {
	/**
	 * Description of the property id.
	 */
	@Id
	private Long
	 id
	;
	/**
	 * Description of the property orderDate.
	 */
	
	private 
	Ref<Date>
	
	 orderDate
	;
	/**
	 * Description of the property customer.
	 */
	
	private 
	Ref<Customer>
	
	 customer
	;
	/**
	 * Description of the property orderLines.
	 */
	
	private 
	List<
	Ref<OrderLine>
	>
	
	 orderLines
	;
	/**
	 * Description of the property deliveryAddress.
	 */
	
	private Address
	 deliveryAddress
	;
	/**
	 * Description of the property creditCard.
	 */
	
	private CreditCard
	 creditCard
	;
	// Start of user code (user defined attributes for Order)
	
	// End of user code
	
	/**
	 * The default constructor.
	 */
	public Order() {
		
	}
	
	/**
	 * Description of the method getId.
	 * @return 
	 */
	
	public long
	 getId() {
		return this.id;
	}
	 
	/**
	 * Description of the method getOrderDate.
	 * @return 
	 */
	
	public Date
	 getOrderDate() {
		return this.orderDate.get();
	}
	 
	/**
	 * Description of the method getCustomer.
	 * @return 
	 */
	
	public Customer
	 getCustomer() {
		return this.customer.get();
	}
	 
	/**
	 * Description of the method getOrderLines.
	 * @return 
	 */
	
	public 
	List<OrderLine>
	
	 getOrderLines() {
		List<OrderLine> orderLines = new ArrayList<OrderLine>();
		
			        if(this.orderLines != null) {
			        	for (Ref<OrderLine> orderline : this.orderLines) {
			                orderLines.add(orderline.get());
			            }
			        }
			        
			        return orderLines;
	}
	 
	/**
	 * Description of the method getDeliveryAddress.
	 * @return 
	 */
	
	public Address
	 getDeliveryAddress() {
		return this.deliveryAddress;
	}
	 
	/**
	 * Description of the method getCreditCard.
	 * @return 
	 */
	
	public CreditCard
	 getCreditCard() {
		return this.creditCard;
	}
	 
	/**
	 * Description of the method setId.
	 * @param id 
	 */
	
	public void
	 setId( long id) {
		this.id = id;
	}
	 
	/**
	 * Description of the method setOrderDate.
	 * @param orderDate 
	 */
	
	public void
	 setOrderDate( Date orderDate) {
		this.orderDate = Ref.create(orderDate);
	}
	 
	/**
	 * Description of the method setCustomer.
	 * @param customer 
	 */
	
	public void
	 setCustomer( Customer customer) {
		this.customer = Ref.create(customer);
	}
	 
	/**
	 * Description of the method setOrderLines.
	 * @param orderLines 
	 */
	
	public void
	 setOrderLines( List<OrderLine> orderLines) {
		this.orderLines = new ArrayList<Ref<OrderLine>>();
					for (OrderLine orderline : orderLines) {
						this.orderLines.add(Ref.create(orderline));
					}
	}
	 
	/**
	 * Description of the method setDeliveryAddress.
	 * @param deliveryAddress 
	 */
	
	public void
	 setDeliveryAddress( Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	 
	/**
	 * Description of the method setCreditCard.
	 * @param creditCard 
	 */
	
	public void
	 setCreditCard( CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	 
	/**
	 * Description of the method addOrderLine.
	 * @param orderline 
	 */
	
	public void
	 addOrderLine( OrderLine orderline) {
		if (orderLines == null)
		   				orderLines = new ArrayList<Ref<OrderLine>>();
					
					orderLines.add(Ref.create(orderline));
	}
	 
	// Start of user code (user defined methods for Order)
	
	// End of user code
	

	

	

	

	

	



}
