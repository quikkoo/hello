name := "hello"
version := "0.0.1"

scalaVersion := "2.11.7"
scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")


resolvers ++= Seq(
  Resolver.mavenLocal,
  DefaultMavenRepository,
  Resolver.typesafeRepo("releases"),
  Resolver.typesafeIvyRepo("releases"),
  "AnormCypher" at "http://repo.anormcypher.org/"
)


libraryDependencies ++= Seq(
  "org.anormcypher" %% "anormcypher" % "0.6.0",

  // client-side libraries
  "org.webjars" %% "webjars-play" % "2.3.0-3",
  "org.webjars" %  "jquery"       % "1.11.3",
  "org.webjars" %  "bootstrap"    % "3.3.5",
  "org.webjars" %  "html5shiv"    % "3.7.2",
  "org.webjars" %  "respond"      % "1.4.2"
)


// playframework settings
lazy val root = (project in file(".")).
  enablePlugins(PlayScala)
