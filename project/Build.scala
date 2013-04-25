import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "hboo"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
 //   "com.gravity" % "gravity-hpaste" % "0.1.11"  exclude("org.apache.thrift", "thrift"),
///    "org.apache.hadoop" % "hadoop-test" % "0.20.2",
  //  "org.apache.hbase" % "hbase" % "0.90.4" % "test" exclude("org.apache.thrift", "thrift"),
  //  "org.apache.hbase" % "hbase" % "0.90.4" % "test" classifier "tests" classifier "" exclude("org.apache.thrift", "thrift"),
  //  "org.apache.hadoop" % "hadoop-core" % "0.20.2",
//    "org.apache.thrift" % "libthrift" % "0.9.0",
    jdbc,
    anorm
  )

//  libraryDependencies += 


  val main = play.Project(appName, appVersion, appDependencies).settings(
/*
    resolvers += "Apache HBase" at "https://repository.apache.org/content/repositories/releases"

    resolvers += "Thrift" at "http://people.apache.org/~rawson/repo/"

    libraryDependencies ++= Seq(
        "org.apache.hadoop" % "hadoop-core" % "0.20-append-r1056497",
        "org.apache.hbase" % "hbase" % "0.90.4"
    )
*/
    // Add your own project settings here      
  )

}
