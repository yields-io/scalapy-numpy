organization := "me.shadaj"

name := "scalapy-numpy"

version := "0.1.0-yields"

scalaVersion := "2.11.12"

fork in runMain := true

javaOptions in Test += "-Djava.library.path=./lib/"
javaOptions in runMain += "-Djava.library.path=./lib/"

libraryDependencies += "me.shadaj" %% "scalapy" % "0.1.0-yields"

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
resolvers += "yields" at "https://build.yields.io/repo"
