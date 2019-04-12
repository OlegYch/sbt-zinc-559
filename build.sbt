lazy val root = project.in(file(".")).settings(
  scalaVersion := "2.13.0-RC1",
  javaOptions += "-Xmx10m",
  fork := true,
)
