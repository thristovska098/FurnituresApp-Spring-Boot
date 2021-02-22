package mk.com.iwec.FurnitureApp.controller;

import org.springframework.web.bind.annotation.RequestBody;

public interface Controller<T> {
	public String calculate(@RequestBody T t);

}
