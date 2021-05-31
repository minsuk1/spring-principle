package hello.core.singleton;

// 미리 객체 생성해두는 방법
public class SingletonService {

    // private선언으로 다른 곳에서 new 방지
    // static이니까 딱 하나만만
    // static영역에 객체 instance 미리 하나 생성
   private static final SingletonService instance = new SingletonService();

   // 이 객체 인스턴스 필요하면 getInstance()를 통해 조회. 같은 인스턴스만 반환
   public static SingletonService getInstance(){
       return instance;
   }

    // 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
