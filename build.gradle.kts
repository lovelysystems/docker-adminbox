plugins {
    id("com.lovelysystems.gradle") version ("1.11.3")
}

lovely {
    gitProject()
    dockerProject(
        "lovelysystems/adminbox",
        platforms = listOf("linux/amd64"),
        buildPlatforms = listOf("linux/amd64"),
    ) {
        from("docker")
    }
}
