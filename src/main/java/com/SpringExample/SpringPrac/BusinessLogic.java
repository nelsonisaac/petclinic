package com.SpringExample.SpringPrac;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
/*@Primary annotation is used to give first priority to this dependency , when there are multiple dependencies*/
//@Primary
@Lazy
public class BusinessLogic implements Coach {
	
	public BusinessLogic() {
		System.out.println("In Constructor:"+getClass().getSimpleName());
	}

	@Override
	public String getWorkout() {
		return "Run for 30mins";
	}
	

}
