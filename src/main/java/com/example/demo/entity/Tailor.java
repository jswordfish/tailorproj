package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tailor")
public class Tailor {

	@Id
	@Column(name="tailor_id", length=10)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tailorId;
	
	@Column(name="tailorname")
	private String tailorName;
	
	@Column(name="shopName")
	private String shopName;
	
	@Column(name="shopNumber")
	private String shopNumber;
	
	@Column(name="description")
	private String description;
	
	@Column(name="dateOfRegistration")
	private Date  dateOfRegistration;
	
	@Column(name="street")
	private String street;
	
	@Column(name="area")
	private String area;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="email")
	private String email;
	
	@Column(name="review")
	private String review;
	
	@Column(name="reviewDate")
	private Date reviewDate;
	
	@Column(name="rating")
	private int rating;
	
	@Column(name="maleDress")
	@ElementCollection(targetClass=String.class)
	private List<String> maleDress;
	
	@Column(name="femaleDress")
	@ElementCollection(targetClass=String.class)
	private List<String> femaleDress;
	
	@Column(name="tags")
	@ElementCollection(targetClass=String.class)
	private List<String> tags;
	
	@Column(name="tailorPics")
	@ElementCollection(targetClass=String.class)
	private List<String> tailorPics;

	public int getTailorId() {
		return tailorId;
	}

	public void setTailorId(int tailorId) {
		this.tailorId = tailorId;
	}

	public String getTailorName() {
		return tailorName;
	}

	public void setTailorName(String tailorName) {
		this.tailorName = tailorName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopNumber() {
		return shopNumber;
	}

	public void setShopNumber(String shopNumber) {
		this.shopNumber = shopNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public List<String> getMaleDress() {
		return maleDress;
	}

	public void setMaleDress(List<String> maleDress) {
		this.maleDress = maleDress;
	}

	public List<String> getFemaleDress() {
		return femaleDress;
	}

	public void setFemaleDress(List<String> femaleDress) {
		this.femaleDress = femaleDress;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getTailorPics() {
		return tailorPics;
	}

	public void setTailorPics(List<String> tailorPics) {
		this.tailorPics = tailorPics;
	}
	
	/*
	 * The constructor 
	 *     Tailor(int, String, String, String, String, Date, String, String, String, String, String, String, String, Date, int, List<String>, List<String>, List<String>, ArrayList<String>) is undefined
	 *The cTailor(int, String, String, String, String, Date, String, String, String, String, String, String, String, Date, int, List<String>, List<String>, List<String>, List<String>) is undefined 
	 */

	public Tailor(int tailorId, String tailorName, String shopName, String shopNumber, String description,
			Date dateOfRegistration, String street, String area, String city, String country, String mobile,
			String email, String review, Date reviewDate, int rating, List<String> maleDress,
			List<String> femaleDress, List<String> tags, List<String> tailorPics) {
		super();
		this.tailorId = tailorId;
		this.tailorName = tailorName;
		this.shopName = shopName;
		this.shopNumber = shopNumber;
		this.description = description;
		this.dateOfRegistration = dateOfRegistration;
		this.street = street;
		this.area = area;
		this.city = city;
		this.country = country;
		this.mobile = mobile;
		this.email = email;
		this.review = review;
		this.reviewDate = reviewDate;
		this.rating = rating;
		this.maleDress = maleDress;
		this.femaleDress = femaleDress;
		this.tags = tags;
		this.tailorPics = tailorPics;
	}

	public Tailor() {
		super();
	}

	public Tailor(Tailor t1) {
		// TODO Auto-generated constructor stub
	}

	
		
		
	
	
	
	
	
}
