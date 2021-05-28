package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
public class OrderServiceImpl implements OrderService {


    //    private final MemberRepository memberRepository = new MemoryMemberRepository();
//
//    // DIP 위반: 할인 정책은 RateDiscountPolicy로 바꾸려면  new fix() interface, 구현 클래스 모두 의존
//    // OCP 위반: 기능 변경하려면 해당 코드를 바꿔야 한다.
//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy
            discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}

