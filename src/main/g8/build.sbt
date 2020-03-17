import BuildSettings._

ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = Project(id = "$name$", base = file("."))
  .aggregate(
    app
  )

lazy val app = module("app")
  .settings(Dependencies.app)
