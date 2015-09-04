/*******************************************************************************
 * File generated from the petstore-app::org::agoncal::application::petstore::domain::Customer uml Class
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
import org.agoncal.application.petstore.domain.Address;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Customer.
 * 
 * @author 
 */
@Entity
public class Customer {
	/**
	 * Description of the property id.
	 */
	@Id
	public Long
	 id
	;
	/**
	 * Description of the property login.
	 */
	
	public String
	 login
	;
	/**
	 * Description of the property password.
	 */
	
	public String
	 password
	;
	/**
	 * Description of the property firstname.
	 */
	
	public String
	 firstname
	;
	/**
	 * Description of the property lastname.
	 */
	
	public String
	 lastname
	;
	/**
	 * Description of the property homeAddress.
	 */
	
	public Address
	 homeAddress
	;
	/**
	 * Description of the property dateOfBirth.
	 */
	
	public 
	Ref<Date>
	
	 dateOfBirth
	;
	// Start of user code (user defined attributes for Customer)
	
	// End of user code
	
	/**
	 * The default constructor.
	 */
	public Customer() {
		
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
	 * Description of the method getLogin.
	 * @return 
	 */
	
	public String
	 getLogin() {
		return this.login;
	}
	 
	/**
	 * Description of the method getPassword.
	 * @return 
	 */
	
	public String
	 getPassword() {
		return this.password;
	}
	 
	/**
	 * Description of the method getFirstname.
	 * @return 
	 */
	
	public String
	 getFirstname() {
		return this.firstname;
	}
	 
	/**
	 * Description of the method getLastname.
	 * @return 
	 */
	
	public String
	 getLastname() {
		return this.lastname;
	}
	 
	/**
	 * Description of the method getHomeAddress.
	 * @return 
	 */
	
	public Address
	 getHomeAddress() {
		return this.homeAddress;
	}
	 
	/**
	 * Description of the method getDateOfBirth.
	 * @return 
	 */
	
	public Date
	 getDateOfBirth() {
		return this.dateOfBirth.get();
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
	 * Description of the method setLogin.
	 * @param login 
	 */
	
	public void
	 setLogin( String login) {
		this.login = login;
	}
	 
	/**
	 * Description of the method setPassword.
	 * @param password 
	 */
	
	public void
	 setPassword( String password) {
		this.password = password;
	}
	 
	/**
	 * Description of the method setFirstname.
	 * @param firstname 
	 */
	
	public void
	 setFirstname( String firstname) {
		this.firstname = firstname;
	}
	 
	/**
	 * Description of the method setLastname.
	 * @param lastname 
	 */
	
	public void
	 setLastname( String lastname) {
		this.lastname = lastname;
	}
	 
	/**
	 * Description of the method setHomeAddress.
	 * @param homeAddress 
	 */
	
	public void
	 setHomeAddress( Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	 
	/**
	 * Description of the method setDateOfBirth.
	 * @param dateOfBirth 
	 */
	
	public void
	 setDateOfBirth( Date dateOfBirth) {
		this.dateOfBirth = Ref.create(dateOfBirth);
	}
	 
	// Start of user code (user defined methods for Customer)
	
	// End of user code
	

	

	

	

	

	

	



}
