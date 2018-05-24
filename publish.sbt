lazy val keyFile = Path.userHome / ".ssh" / "id_rsa"

publishTo in ThisBuild := Some(
  Resolver.ssh("yields-repo", "build.yields.io", "/home/ivy/repo") as ("ivy", keyFile) withPermissions ("0644")
)
