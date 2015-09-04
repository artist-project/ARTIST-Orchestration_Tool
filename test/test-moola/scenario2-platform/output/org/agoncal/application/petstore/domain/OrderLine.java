/*******************************************************************************
 * File generated from the petstore-app::org::agoncal::application::petstore::domain::OrderLine uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 04. September 2015 10:00:13 MESZ
 *******************************************************************************/
package org.agoncal.application.petstore.domain;

import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.Ref;
import java.lang.Long;
import java.util.ArrayList;
import org.agoncal.application.petstore.domain.Item;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of OrderLine.
 * 
 * @author 
 */
@Entity
public class OrderLine {
	/**
	 * Description of the property id.
	 */
	@Id
	private Long
	 id
	;
	/**
	 * Description of the property quantity.
	 */
	
	private int
	 quantity
	;
	/**
	 * Description of the property item.
	 */
	
	private 
	Ref<Item>
	
	 item
	;
	// Start of user code (user defined attributes for OrderLine)
	
	// End of user code
	
	/**
	 * The default constructor.
	 */
	public OrderLine() {
		
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
	 * Description of the method getQuantity.
	 * @return 
	 */
	
	public int
	 getQuantity() {
		return this.quantity;
	}
	 
	/**
	 * Description of the method getItem.
	 * @return 
	 */
	
	public Item
	 getItem() {
		return this.item.get();
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
	 * Description of the method setQuantity.
	 * @param quantity 
	 */
	
	public void
	 setQuantity( int quantity) {
		this.quantity = quantity;
	}
	 
	/**
	 * Description of the method setItem.
	 * @param item 
	 */
	
	public void
	 setItem( Item item) {
		this.item = Ref.create(item);
	}
	 
	// Start of user code (user defined methods for OrderLine)
	
	// End of user code
	

	

	



}
