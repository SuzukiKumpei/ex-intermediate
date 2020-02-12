package com.example.domain;

/**
 * ホテル情報を表すドメイン.
 * 
 * @author suzukikunpei
 *
 */
public class Hotel {
	/**ホテルID */
	private Integer id;
	/**エリア名*/
	private String area_name;
	/**ホテル名*/
	private String hotel_name;
	/**住所*/
	private String address;
	/**最寄駅*/
	private String nearest_station;
	/**料金*/
	private Integer price;
	/**最寄駅 */
	private String parking;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArea_name() {
		return area_name;
	}

	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNearest_station() {
		return nearest_station;
	}

	public void setNearest_station(String nearest_station) {
		this.nearest_station = nearest_station;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", area_name=" + area_name + ", hotel_name=" + hotel_name + ", address=" + address
				+ ", nearest_station=" + nearest_station + ", price=" + price + ", parking=" + parking + "]";
	}

}
