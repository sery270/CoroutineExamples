# ♻️ CoroutineExamples
CoroutineExamples는 [Android 권장 비동기 처리 방식](https://developer.android.com/kotlin/coroutines?#features)인 Coroutine && Flow 에 대해 공부한 내용과, 관련 snippet들을 정리하는 저장소입니다.

현재 참여하고 있는 모든 프로젝트에서 (회사, 사이드 프로젝트들) Coroutine, Flow를 적극 활용하고 있는만큼 제대로 알고 사용하고 싶었고, 기왕 사용하는 만큼 멋지게 사용해보고 싶기에 딥 다이브 하고자 합니다 :> 
<p align="center">
  <img height="300" src="https://user-images.githubusercontent.com/59532818/164753787-b77c20d0-8b11-4cd3-a9c4-3336fb45802b.png">
</p>

### 🙂 2022/04/25 월
------
- suspend lambda, WorkManager, CoroutineWorker 에 대해 공부하고 테스트 코드를 작성해보았다. 
- 이번 코드랩을 진행하면서, 구글에서 특정 기술을 support 해준다는 것이 어떤 의미인지 깨달았다. "First class coroutines support"
  - `ViewmodelScope`, `WorkManager`, `Room` 그리고 서드 파티지만 `Retrofit` 까지 코루틴을 support 해주고 있었고, 이것이 개발자들에게 큰 편의를 주고 있었다. 
  - 그리고 관련해서 [Understand Kotlin Coroutines on Android (Google I/O'19)](https://www.youtube.com/watch?v=BOHK_w09pVA)를 보면서 깨달은게 있었다. (개발자들에게 큰 편의를 주는) 이러한 기술적인 지원이 사실 구글의 독단적인 리딩이 아니라, **개발자들의 경험인 UXR와 이를 바탕으로 기획한 것들이라는 것**을 알게 되면서, **개발자들의 의견에 귀기울이고 발전해가는 안드로이드 생태계의 일원이라는 것에 큰 자부심을 느꼈다** 😋
- **Testing Coroutine** 부분은 생각보다 이해하기 어려웠다. 간단하게 이해하고 넘어가려해도 무슨 설명인지 와닿지가 않았다. 
  - 추후에 별도의 주제로 친구들과 함께 보고 싶다. 
  - [관련해서 찾은 좋은 자료](https://tourspace.tistory.com/266)
- `RecyclerView.Adapter`에서 `DiffUtil` 작업을 코루틴을 활용하여 성능을 개선할 수 있을 것 같다. 당장 시도해봐야지 💪

**📝 공부 흔적**
- [👩🏻‍🏫 코드랩 실습: Use Kotlin Coroutines in your Android App 이어서](https://github.com/sery270/kotlin-coroutines#suspend-lambda-higher-order-functions)


### 🙂 2022/04/22 금
------
- 콜백과 코루틴을 비교하면서 코루틴의 기본적인 사용방법과 동작을 학습하고, 코루틴을 support하는 라이브러리인 Room, Retrofit로 간결하게 비동기 처리하는 방법에 대해서 정리했다. 
- 러프하게 코루틴에 대한 Testing, Exception 처리 방법에 대해서도 공부했다. 

**📝 공부 흔적**
- [👩🏻‍🏫 코드랩 실습: Use Kotlin Coroutines in your Android App](https://github.com/sery270/kotlin-coroutines)
