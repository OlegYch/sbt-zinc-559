lazy val root = project.in(file(".")).settings(scalaVersion := "2.12.6", incOptions := incOptions.value.withRecompileAllFraction(1))
