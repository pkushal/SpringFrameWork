package com.kushal.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera implements PhotoSnapper, ICamera {
	public Camera() {
		System.out.println("Hello from Camera Constructor");
	}

	/* (non-Javadoc)
	 * @see com.kushal.spring.aop.ICamera#snap()
	 */
	@Override
	public void snap() throws Exception {
		System.out.println("snapped");
		// throw new Exception("bye bye");
	}

	/* (non-Javadoc)
	 * @see com.kushal.spring.aop.ICamera#snap(int)
	 */
	@Override
	public void snap(int exposure) {
		System.out.println("snapped for " + exposure + " milliseconds");
	}

	/* (non-Javadoc)
	 * @see com.kushal.spring.aop.ICamera#snap(java.lang.String)
	 */
	@Override
	public String snap(String name) {
		System.out.println("snapped with " + name + " camera");
		return name;
	}

	/* (non-Javadoc)
	 * @see com.kushal.spring.aop.ICamera#snapNight()
	 */
	@Override
	public void snapNight() {
		System.out.println("snapped Night Mode");
	}

}
