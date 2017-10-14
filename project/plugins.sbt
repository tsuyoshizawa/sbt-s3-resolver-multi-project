scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

resolvers += Resolver.jcenterRepo
addSbtPlugin("ohnosequences" % "sbt-s3-resolver" % "0.18.0")
