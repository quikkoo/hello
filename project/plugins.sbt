logLevel := Level.Warn

resolvers ++= Seq(
  Resolver.mavenLocal,
  DefaultMavenRepository,
  Resolver.typesafeRepo("releases"),
  Resolver.typesafeIvyRepo("releases"),
  Resolver.sbtPluginRepo("releases")
)


addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "3.0.0")
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.9")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.7.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.2.0")
addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.0.0")
