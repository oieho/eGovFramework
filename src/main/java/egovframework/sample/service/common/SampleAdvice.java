package egovframework.sample.service.common;

public class SampleAdvice {
	public void beforeLogic(){
		System.out.println("[사전 처리] 비즈니스 로직 수행 전 동작");
	}
	
	public void afterLogic() {
		System.out.println("[사후 처리] 비즈니스 로직 수행 후 동작");
	}
}
