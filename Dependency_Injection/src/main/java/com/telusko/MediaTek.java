package com.telusko;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor
{
	public void processes()
	{
		System.out.println("Media Tek at 1ms");
	}
}
