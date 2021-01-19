rootProject.name = "Commodore"

include("Common")
include("Bungeecord")
include("Bukkit")

fun setupSubproject(name: String, projectDirectory: File) = setupSubproject(name) {
    projectDir = projectDirectory
}

inline fun setupSubproject(name: String, block: ProjectDescriptor.() -> Unit) {
    include(name)
    project(":$name").apply(block)
}