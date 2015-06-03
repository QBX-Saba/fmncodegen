name := """fmn-pcgen"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.28",
  "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final",
  "org.hibernate.javax.persistence" % "hibernate-jpa-2.1-api" % "1.0.0.Final",
  "org.apache.velocity" % "velocity" % "1.7"  
 )
 