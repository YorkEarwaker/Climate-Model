/**
 * 
 */
package org.agw.eea;

/**
 * 
 */
public class SimpleWeatherEventModel implements WeatherEventModel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Simple Weather Event Model!");
	}
	
	/**
	* default-constructor
	*/ 
	private SimpleWeatherEventModel() {
		super();
		System.out.print("Simple Weather Event Model.default-constructor ");
	}
	
	@Override
	public void model() {
		System.out.print("Simple Weather Event Model.model ");
	}
		
	@Override
	public void time() {
		System.out.print("Simple Weather Event Model.time ");
	}
	
	@Override
	public void space() {
		System.out.print("Simple Weather Event Model.space ");
	}

	@Override
	public void weatherEvent() {
		System.out.print("Simple Weather Event Model.forcing ");
	}
}
