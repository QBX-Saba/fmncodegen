name := """fmn-pcgen"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.28",
   javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.9.Final",
  "org.apache.velocity" % "velocity" % "1.7"  
 )
 