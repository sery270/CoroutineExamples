object KotlinDependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinxSerializationVersion}"
    const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.kotlinDateTimeVersion}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutinesVersion}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutinesVersion}"
    const val coroutinesReactive = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${Versions.kotlinCoroutinesVersion}"
}

object AndroidXDependencies {
    const val coreKtx = "androidx.core:core-ktx:${Versions.core_ktx_version}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat_version}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout_version}"
    const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_version}"
    const val lifecycleJava8 = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle_version}"
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt_version}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"
    const val paging3 = "androidx.paging:paging-runtime:${Versions.paging_version}"
    const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment_version}"
    const val legacy = "androidx.legacy:legacy-support-v4:1.0.0"
    const val room = "androidx.room:room-runtime:${Versions.room_version}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room_version}"
    const val security = "androidx.security:security-crypto:${Versions.securityVersion}"
    const val startUp = "androidx.startup:startup-runtime:${Versions.startUpVersion}"
}

object TestDependencies {
    const val jUnit = "junit:junit:${Versions.junit_version}"
    const val androidTest = "androidx.test.ext:junit:${Versions.androidtest_version}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso_version}"
    const val room = "androidx.room:room-testing:${Versions.room_version}"
}

object MaterialDesignDependencies {
    const val materialDesign =
        "com.google.android.material:material:${Versions.material_design_version}"
}

object KaptDependencies {
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt_version}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room_version}"
}

object ThirdPartyDependencies {
    const val gson = "com.google.code.gson:gson:${Versions.gson_version}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide_version}"
    const val dotIndicator = "com.tbuonomo:dotsindicator:${Versions.dotIndicatorVersion}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber_version}"
    const val scarlet = "com.tinder.scarlet:scarlet:${Versions.scarlet_version}"
    const val scarletOkHttp = "com.tinder.scarlet:websocket-okhttp:${Versions.scarlet_version}"
    const val scarletGson = "com.tinder.scarlet:message-adapter-gson:${Versions.scarlet_version}"
    const val scarletCoroutine = "com.tinder.scarlet:stream-adapter-coroutines:${Versions.scarlet_version}"
    const val okHttpBom = "com.squareup.okhttp3:okhttp-bom:${Versions.okHttp_version}"
    const val okHttp = "com.squareup.okhttp3:okhttp"
    const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    const val retrofitSerialization =
        "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.kotlinx_serialization_version}"
    const val kakaoLogin = "com.kakao.sdk:v2-user:${Versions.kakaoSDK_version}"
    const val flipper = "com.facebook.flipper:flipper:${Versions.flipperVersion}"
    const val flipperNetwork = "com.facebook.flipper:flipper-network-plugin:${Versions.flipperVersion}"
    const val soloader = "com.facebook.soloader:soloader:${Versions.soloaderVersion}"
    const val flipperLeakCanary = "com.facebook.flipper:flipper-leakcanary2-plugin:${Versions.flipperVersion}"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanaryVersion}"
    const val imagePicker = "io.github.ParkSangGwon:tedimagepicker:${Versions.imagePickerVersion}"
    const val stompClient = "com.github.NaikSoftware:StompProtocolAndroid:${Versions.stompVersion}"
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxVersion}"
}

object FirebaseDependency {
    const val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebase_version}"
    const val analyticsKtx = "com.google.firebase:firebase-analytics-ktx"
    const val realtimeDatabaseKtx = "com.google.firebase:firebase-database-ktx"
    const val messagingKtx = "com.google.firebase:firebase-messaging-ktx"
}

object ClassPathPlugins {
    const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt_version}"
    const val googleService = "com.google.gms:google-services:${Versions.google_service_version}"
    const val navigationArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.nav_version}"
}
