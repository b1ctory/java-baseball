# java- baseball

 ### **< 기능 요구사항 >**
+ 1부터 9까지 서로 다른 수로 이루어진 3가지의 수를 맞추는 게임이다.
+ 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 
같은 수가 전혀 없으면 낫싱이라는 힌트를 얻고, 그 힌트를 사용해서 정답을 맞춘다.  

**[예]** 상대방(컴퓨터)의 수가 425일 때, 사용자가 입력한 값이 : 
- 123인 경우 : 1 스트라이크,   
- 456인 경우 : 1 스트라이크 1볼,   
- 789인 경우 : 낫싱

+ 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
+ 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
* [미션 시작하기](https://github.com/backlo-study-programing/study-docs/blob/master/%EB%AF%B8%EC%85%98%20%EC%8B%9C%EC%9E%91.md)
 
* [온라인 코드 리뷰 과정](https://github.com/backlo-study-programing/study-docs/blob/master/%EC%BD%94%EB%93%9C%20%EB%A6%AC%EB%B7%B0.md)

* [참고 자료](https://github.com/backlo-study-programing/study-docs/blob/master/Java%20%EC%9E%90%EB%A3%8C/%EC%9E%90%EB%B0%94%20%EC%9E%90%EB%A3%8C.md)

### **구현 기능 목록**

1. 게임을 실행시키는 Main Class 생성
2. 랜덤으로 세자리 수를 (정답) 만들어주는 함수 생성 -> generateRandomNumber()
3. 유저에게 정답을 입력받는 함수 생성 -> inputNumber()
4. 유저가 입력한 답에 대해 볼, 스트라이크, 낫싱의 힌트를 알려주는 함수 생성  -> isStrike(), isBall(), isNothing()
5. 유저가 게임을 다시 시작할것인지 종료할것인지 선택하도록 하는 함수 생성 -> inputRestart()