package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OthorController {
	@RequestMapping("/othor")
	@ResponseBody
	public Map<String, String> othor() {
		Map<String, String> map = new HashMap<String,String>();
		map.put("is this first?", "yes,it is!");
		return map;
		
	}

}
