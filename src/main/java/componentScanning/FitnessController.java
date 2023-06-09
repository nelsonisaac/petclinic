package componentScanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringExample.SpringPrac.Coach;

@RestController
public class FitnessController {

	
//	Defining @Autowired directly to private variable is FIELD INJECTION 
//	@Autowired
	private Coach c1;
	private Coach c2;
//	Defining @Autowired to a constructor is CONSTRUCTOR INJECTION
//  @Autowired	
	
	/*@Qualifier is used to specifically inject dependency from a particular class.
	 * make sure to write first letter small instead of capital letter while mentioning class*/
	public FitnessController(@Qualifier("cricketCoach") Coach coach,
							 @Qualifier("cricketCoach") Coach secCoach) {
		this.c1 = coach;
		this.c2 = secCoach;
	}
	
//	public FitnessController(Coach coach) {
//		this.c = coach;
//	}
	
	/*Defining @Autowired to a setter method is SETTER INJECTION
    @Autowired*/
//	public void setCoach(Coach coach) {
//		this.c = coach;	
//	}
	
	@GetMapping("/getplan")
	public String workout() {
		return c1.getWorkout();
	}
	
	/*to check the scope of the beans created by spring*/
	@GetMapping("/check")
	public String check() {
		return "check if c1=c2" + (c1==c2);
	}

}
