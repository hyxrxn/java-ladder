# java-ladder

사다리 타기 미션 저장소

## 명칭 정의
1. 사다리의 `|`으로 이루어진 세로 한 줄 - 세로라인
2. 사다리의 `-`으로 이루어진 가로 한 줄 - 가로라인, step
3. 사다리의 `|-----|`으로 이루어진 가로 한 줄 - 층

## 기능 요구사항
1. - [x] 참여할 사람의 이름을 입력받는다.
      - [x] 사람 이름은 쉼표로 구분한다.
      - [x] 사람 이름은 1자 이상 5자 이하여야 한다.
      - [x] 사람 이름은 공백으로만 이루어질 수 없다.
      - [x] 사람 이름은 중복을 허용하지 않는다.
      - [x] 사람은 2명 이상 50명 이하여야 한다.
2. - [x] 최대 사다리 높이를 입력받는다.
      - [x] 사다리 높이는 1개 이상 100개 이하의 정수여야 한다.
3. - [x] 사다리를 생성한다.
      - [x] 사다리 가로라인은 `|-----|-----|`와 같이 연속할 수 없다.
4. - [x] 사다리 결과를 출력한다.
      - [x] 사람 이름은 `"%5s "`으로 출력한다.
      - [x] 가로라인은 `-` 5개로 표현한다.
      - [x] 세로라인은 사다리 높이만큼 `|` 개수로 표현한다.
5. - [x] 실행 결과를 출력한다.
      - [x] all이 입력되면 모든 결과를 출력한다.
      - [x] 사람 이름이 입력되면 그 사람의 결과를 출력한다.
   
## 기능 구현사항
1. model
    - Height
      - 높이 범위 검증
    - Line
      - 한 칸 만들기
      - 한 층 만들기
      - 해당 위치에 칸이 있는지 확인
      - 현재 위치를 이용해 다음 위치 결정
    - Ladder
      - 사다리 만들기
      - 처음 위치를 이용해 마지막 위치 결정
    - Name
      - 이름 없음 검증
      - 이름 길이 검증
      - 불가능한 이름 검증
    - Participants
      - 참가자 수 검증
      - 참가자 이름 중복 검증
    - StepPoint
      - step의 존재 여부 표현
    - RandomStepGenerator
      - StepPoint 랜덤으로 생성
    - Prize
      - 결과 없음 검증
    - Result
      - 결과의 개수와 참가자 명수 일치 검증
    - MatchResult
      - 참가자별 결과 확인
2. View
    - InputView
      - 이름 입력
      - 이름이 구분자로 끝나는지 여부 검증
      - 높이 입력
      - 높이가 정수인지 여부 검증
      - 결과 입력
      - 결과가 구분자로 끝나는지 여부 검증
      - 결과를 보고 싶은 사람 입력
    - OutputView
      - 사다리 결과 출력
      - 실행 결과 출력

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
