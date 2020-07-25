package com.telusko;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



// Java configuration for configuring class Path.....
// Component scan to scan through packages and underlying classes.....

@Configuration
@ComponentScan(basePackages = {"com.telusko","unknown"})
public class AppConfig 
{

}
