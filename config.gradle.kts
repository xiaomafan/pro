buildscript {
    extra["userName"] = "xiaoma"
    extra["password"] = "success"
    extra["isRelease"] = true

    val compileSdk by extra(34)
    val minSdk by extra(24)
    val targetSdk by extra(33)
    val versionCode by extra(1)
    val versionName by extra("1.0")


}