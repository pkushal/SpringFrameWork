package com.kushal.spring.introduction;

import org.springframework.stereotype.Component;

@Component
public class Fan implements IFan {
	/* (non-Javadoc)
	 * @see com.kushal.spring.introduction.IFan#activate(int)
	 */
	@Override
	public void activate(int a) {
		System.out.println("Fan activated at level " + a);
	}
}
