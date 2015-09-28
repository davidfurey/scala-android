import android.Keys._

android.Plugin.androidBuild

platformTarget in Android := "android-21"

// Application Name
name := """scala-android"""

// Application Version
version := "1.0.0"

scalaVersion := "2.11.4"

resolvers ++= Seq(Resolver.mavenLocal,
  DefaultMavenRepository,
  Resolver.typesafeRepo("releases"),
  Resolver.typesafeRepo("snapshots"),
  Resolver.typesafeIvyRepo("snapshots"),
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.defaultLocal)

// Override the run task with the android:run
run <<= run in Android

// Activate proguard for Scala
proguardScala in Android := true

// Activate proguard for Android
useProguard in Android := true

proguardOptions in Android ++= Seq(
  "-ignorewarnings",
  "-keep class scala.Dynamic")

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions += "-target:jvm-1.7"