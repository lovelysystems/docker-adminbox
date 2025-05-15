plugins {
    id("com.lovelysystems.gradle") version ("1.15.1")
}

lovely {
    gitProject()
    dockerProject(
        "lovelysystems/adminbox",
    ) {
        from("docker")
    }
}
