logLevel := Level.Warn

resolvers += Resolver.bintrayIvyRepo("ltrojanowski", "test-affected")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.2")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.2")

addSbtPlugin("org.scalastyle"  %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.wartremover" % "sbt-wartremover"        % "2.2.1")

addSbtPlugin("com.lucidchart" % "sbt-scalafmt-coursier" % "1.12")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")

addSbtPlugin("com.ltrojanowski" % "testaffected" % "0.1")

addSbtPlugin("jp.ne.opt" % "sbt-diff-project" % "0.2.1")
