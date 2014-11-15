package com.kushal.spring.introduction;

import org.springframework.stereotype.Component;

@Component
public class Blender implements IBlender  {
	/* (non-Javadoc)
	 * @see com.kushal.spring.introduction.IBlender#blend()
	 */
	@Override
	public void blend() {
		System.out.println("Blending...");
	}
}
