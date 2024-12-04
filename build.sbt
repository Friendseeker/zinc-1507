ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.15"

import sbt.internal.inc.Analysis

lazy val A = (project in file("A"))
  .settings(
    name := "A"
  )

lazy val B = (project in file("B"))
  .settings(
    name := "B",
  ).dependsOn(A)

TaskKey[Unit]("diagnostic") := {
  val stamps = (B / Compile / compile).value.asInstanceOf[Analysis].stamps

  println("libraries = " + stamps.libraries)
}