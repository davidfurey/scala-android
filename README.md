Scala Android Skeleton Project
==============================

1. Download and install the Android SDK tool (https://developer.android.com/sdk/index.html#Other)
2. Install Android 5.0.1 (API 21) SDK Platform using the Android SDK manager
3. Set environment variable `ANDROID_HOME` to your Android SDK location

Testing on device
-----------------

Run `sbt run` to deploy to a connected Android device


Android Studio
--------------

NB- Android Studio will be unhappy until R.java has been generated by running `sbt compile`

1. Install Scala plugin
2. Open scala-android project, setting project SDK to "Android API 21 Platform"
3. Configure Android Facet:
  * Project Structure->Facets
  * Add Android facet
  * Ensure Manifest file, Resources directory and assets directory are correct


