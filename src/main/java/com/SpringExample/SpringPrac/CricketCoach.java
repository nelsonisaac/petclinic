package com.SpringExample.SpringPrac;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Lazy annotation is used to mark a dependency as lazy so that spring will not created a bean by default*/
@Component

/* @scope is used to define the no of beans to be created 
 * if scope is singleton(By default) then for every dependency one 1 bean is created
 * if scope is Prototype then for every dependency new bean is created */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

	public CricketCoach() {
		System.out.println("In Constructor:"+getClass().getSimpleName());
	}
	
	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "practice batting for 30 mins";
	}
	
	

}
