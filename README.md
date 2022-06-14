# ♻️ CoroutineExamples
CoroutineExamples는 [Android 권장 비동기 처리 방식](https://developer.android.com/kotlin/coroutines?#features)인 Coroutine && Flow 에 대해 공부한 내용과, 관련 snippet들을 정리하는 저장소입니다.

현재 참여하고 있는 모든 프로젝트에서 (회사, 사이드 프로젝트들) Coroutine, Flow를 적극 활용하고 있는만큼 제대로 알고 사용하고 싶었고, 기왕 사용하는 만큼 멋지게 사용해보고 싶기에 딥 다이브 하고자 합니다 :> 
<p align="center">
  <img height="300" src="https://user-images.githubusercontent.com/59532818/164753787-b77c20d0-8b11-4cd3-a9c4-3336fb45802b.png">
</p>

### 🙂 2022/05/13 금
------
#### 동시성
- 운영체제는 선점형 멀티태스킹의 중재자로, 가장 높은 권한을 가지고 있으며, CPU가 하나인 컴퓨터에서 시분할의 방법으로 멀티 태스킹을 동작 시킨다.
- 운영체제는 1개 이상의 프로세스를 시분할에 의해 번갈아서 동작 시킨다.
    - 코드, 데이터, 힙, 스택 등의 자료구조를 가지고 있다.
- 프로세스는 1개 이상의 스레드를 시분할에 의해 번갈아서 동작 시킨다.
    - 일반적으로 각 스레드마다 스택을 구분하고 나머지는 공유한다. (운영체제마다 다를 수 있다.)

#### 병렬성
- SMP (Symmetric Multiprocessor)의 등장으로 병렬성이 강조되기 시작했다.
- SMP는 여러 프로세스가 하나의 메모리를 쓰는 모델로, 물리적으로 여러 프로세스가 여러 일을 동시에 하는 일이 가능해졌다.
- 코루틴은 비동기와 병렬성 코드를 순차적으로 해결한다.
- 플로우는 비동기와 병렬성을 스트림으로 해결한다.

### 🙂 2022/05/03 화
------
- Coroutine 소개해주는 2019 년도 구글 아요를 보고 정리해보았다 ! 구글 최고 😎😎

**📝 공부 흔적** 
- [✏️포스팅: Understand Kotlin Coroutines on Android (Google I/O'19)](https://velog.io/@sery270/NOTE-Understand-Kotlin-Coroutines-on-Android-Google-IO19)

### 🙂 2022/04/26 화
------
- [`RecyclerView.Adapter`에서 `DiffUtil` 작업을 코루틴을 활용하여 성능을 개선해보는 프로젝트](https://github.com/sery270/CoroutineExamples/tree/main/DiffUtilbyCoroutine)를 기획 및 세팅했다 
- kts로 gradle을 세팅하고, [빌드에 필요한 정보들을(dependency, 앱 정보 등등) 정리해놓은 buildSrc](https://github.com/sery270/CoroutineExamples/tree/main/buildSrc)를 추가했다. 앞으로 새 프로젝트 생성시 import module해서 사용하면 된다. 
    ```
    # buildSrc import 및 kts 세팅하기 
    
    1. 기존 gradle 파일들을 모두 kts로 변환한다. 기존 파일에 .kts를 붙인 후 내용을 변경한다. 
      - build.gradle.kts (project)
      - build.gradle.kts (app)
      - build.gradle.kts (buildSrc) (import module 이후에 추가되니, 추가 생성하지 않는다.) 
      - settings.gradle.kts (buildSrc)

    3. import module로 buildSrc를 import 한다. 
      - 에러가 발생하면 settings.gradle.kts의 내용을 확인해서 include(":buildSrc")가 있는지 확인한다. 있다면 제거한다. 
 
    4. 필요한 dependency를 추가한다. 

    5. 앱 이름 등등 프로젝트에 맞게 적절히 커스텀한다. 
    ```

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
