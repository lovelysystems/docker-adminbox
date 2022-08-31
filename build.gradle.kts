plugins {
    id("com.lovelysystems.gradle") version ("1.9.1")
}

lovely {
    gitProject()
    dockerProject(
        "lovelysystems/adminbox",
        platforms = listOf("linux/amd64"),
        buildPlatforms = listOf("linux/amd64"),
    )

    with(dockerFiles) {
        from("docker")
    }
}
