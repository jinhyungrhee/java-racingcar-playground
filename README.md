## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```


## 기능 명세 
- [X] 각 자동차는 조건에 따라 본인이 움직일 수 있는지 없는지를 스스로 판단한다.
- [X] 각 자동차는 매 라운드 움직일 수 있으면 위치 값(location)을 1증가 시킨다.
- [X] 매 라운드가 끝나면 각 자동차의 이름과 위치(location)를 출력한다.
- [X] 입력 받은 시도횟수의 라운드가 끝나면 각 자동차의 위치를 비교하여 우승자를 출력한다. (복수 가능)
- [X] 경주를 시작(Race.start())하면 입력받은 횟수만큼 자동차들에게 달리도록 메시지(Car.run())를 보낸다.
- [X] 경주를 진행하면(Race.procced()) 각 자동차를 움직이고 그 결과를 출력한다.
