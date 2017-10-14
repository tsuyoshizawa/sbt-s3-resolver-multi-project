import Dependencies._
import com.amazonaws.regions._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies += scalaTest % Test
  )
  .aggregate(core)

lazy val core = (project in file("core"))
  .settings(
    name := "core"
  )

s3region := new AwsProfileRegionProvider("my-profile")
