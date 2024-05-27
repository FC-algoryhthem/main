# 깃허브
- 브랜치를 생성하지 않은 경우
> git checkout -b yourBranch
- 생성했지만 브랜치 이동은 하지 않은 경우
> git checkout YourBranch
--------
# 본인 브랜치에서 문제를 풀고 본인 브랜치로 커밋 합니다
### 원격 브랜치로 푸쉬
- 원격 저장소의 메인 브랜치와 헤드를 맞춘다.
> git pull origin main
> - 로컬 저장소의 커밋을 원격 저장소로 푸쉬
  <span style="color:red">메인 브랜치로 푸쉬하는게 아닙니다.</span>
  - 본인이 생성한 브랜치의 로 푸쉬한다.
  - 코드 리뷰 후에 메인 브랜치로 머지합니다.
> git push origin yourBranch

--------
<img width="827" alt="image" src="https://github.com/GroupStudy-algoryhthem/main/assets/66647057/520647ff-7739-4ce5-8574-0404a6c58e32">


- 원격 저장소의 브랜치와 로컬 저장소의 브랜치가 서로 맞지 않아서 발생하는 문제 입니다.
> git pull origin yourBranch

### PR 올리기 
- 깃허브 페이지로 들어와서 본인 브랜치를 메인 브랜치 PR 요청한다.

### 현재 브랜치와 명시된 원격 브랜치 기본 연결
#### git push -u origin main






