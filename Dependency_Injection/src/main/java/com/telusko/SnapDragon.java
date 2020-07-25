package com.telusko;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor
{
	public void processes()
	{
		System.out.println("Snap Dragon at 1ms");
	}
}
