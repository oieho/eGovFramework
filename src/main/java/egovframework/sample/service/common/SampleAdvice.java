package egovframework.sample.service.common;

public class SampleAdvice {
	public void beforeLogic(){
		System.out.println("[사전 처리] 비즈니스 로직 수행 전 동작");
	}
	
	public void afterReturningLogic() {
		System.out.println("[사후 처리] 비즈니스 메소드 리턴 값을 받아서 동작");
	}
	public void afterThrowingLogic() {
		System.out.println("[예외 처리] 비즈니스 로직 수행 중 예외 발생!");
	}
	
	public void afterLogic() {
		System.out.println("[사후 처리] 비즈니스 로직 수행 후 무조건 동작");
	}

}
