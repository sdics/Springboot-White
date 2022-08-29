package site.metacoding.white;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Third;

// 고급 데이터 받기( json, x-www-form-머시기, text )

@RestController
public class ThirdController {
	
	// 리퀘스트 DTO 요청을 위한 뭐시기뭐시기
	@PostMapping("/third")
	public String postData(Third third) {
		return "id : " + third.getId()+", title : " + third.getTitle() + ", content :" + third.getContent();
	}
	
	// UPDATE third SET title = ? , content =?, WHERE id = ?
	@PutMapping("/third/{id}")
	public String puData(@PathVariable Integer id, Third third) {
		return third.toString();
	}
	
	@PutMapping("/third/{id}/json")
	public String puJsonData(@PathVariable Integer id, @RequestBody Third third) {
		return third.toString();
	}
	
}
