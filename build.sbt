scalaVersion := "3.9.0"

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "pig-scalajs-daisyui",
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= {
      _.withModuleKind(org.scalajs.linker.interface.ModuleKind.ESModule)
        .withModuleSplitStyle(org.scalajs.linker.interface.ModuleSplitStyle.SmallModulesFor(List("app")))
    },
    libraryDependencies += "org.scala-js" %% "scalajs-dom" % "2.8.1",
    libraryDependencies += "com.raquo" %% "laminar" % "17.2.1",
    libraryDependencies += "org.felher" %% "laminouter" % "0.17.2"
  )