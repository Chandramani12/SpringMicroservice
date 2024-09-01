package Viewexample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "limitconfig")
public class ViewlimitConfig {
	
	private int max;
	private int min;
	public int getMax() {
		return max;
	}
	
	public ViewlimitConfig(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	public ViewlimitConfig() {}
	

}
