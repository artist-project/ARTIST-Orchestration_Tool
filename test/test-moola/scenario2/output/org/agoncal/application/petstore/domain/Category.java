/*******************************************************************************
 * File generated from the petstore-app::org::agoncal::application::petstore::domain::Category uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 04. September 2015 09:24:22 MESZ
 *******************************************************************************/
package org.agoncal.application.petstore.domain;

import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.Ref;
import java.lang.Long;
import java.util.ArrayList;
import java.util.List;
import org.agoncal.application.petstore.domain.Product;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Category.
 * 
 * @author 
 */
@Entity
public class Category {
	/**
	 * Description of the property id.
	 */
	@Id
	private Long
	 id
	;
	/**
	 * Description of the property name.
	 */
	
	private String
	 name
	;
	/**
	 * Description of the property description.
	 */
	
	private String
	 description
	;
	/**
	 * Description of the property products.
	 */
	
	private 
	List<
	Ref<Product>
	>
	
	 products
	;
	// Start of user code (user defined attributes for Category)
	
	// End of user code
	
	/**
	 * The default constructor.
	 */
	public Category() {
		
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
	 * Description of the method getName.
	 * @return 
	 */
	
	public String
	 getName() {
		return this.name;
	}
	 
	/**
	 * Description of the method getDescription.
	 * @return 
	 */
	
	public String
	 getDescription() {
		return this.description;
	}
	 
	/**
	 * Description of the method getProducts.
	 * @return 
	 */
	
	public 
	List<Product>
	
	 getProducts() {
		List<Product> products = new ArrayList<Product>();
		
			        if(this.products != null) {
			        	for (Ref<Product> product : this.products) {
			                products.add(product.get());
			            }
			        }
			        
			        return products;
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
	 * Description of the method setName.
	 * @param name 
	 */
	
	public void
	 setName( String name) {
		this.name = name;
	}
	 
	/**
	 * Description of the method setDescription.
	 * @param description 
	 */
	
	public void
	 setDescription( String description) {
		this.description = description;
	}
	 
	/**
	 * Description of the method setProducts.
	 * @param products 
	 */
	
	public void
	 setProducts( List<Product> products) {
		this.products = new ArrayList<Ref<Product>>();
					for (Product product : products) {
						this.products.add(Ref.create(product));
					}
	}
	 
	/**
	 * Description of the method addProduct.
	 * @param product 
	 */
	
	public void
	 addProduct( Product product) {
		if (products == null)
		   				products = new ArrayList<Ref<Product>>();
					
					products.add(Ref.create(product));
	}
	 
	// Start of user code (user defined methods for Category)
	
	// End of user code
	

	

	

	



}
