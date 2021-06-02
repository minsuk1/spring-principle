package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    // @Autowired
    // AppConfig에서는 @Bean 으로 직접 설정 정보 작성 및 의존관계도 명시했다.
    // 하지만 @Autowired 덕분에 자동으로 DI 해준다.
    // 타입이 같은 빈을 찾아서 주입한다
    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(Member member) {
        memberRepository.save(member);
    }

    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}