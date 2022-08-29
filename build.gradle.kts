plugins {
    id("com.lovelysystems.gradle") version ("1.8.1")
}

lovely {
    gitProject()
    dockerProject("lovelysystems/adminbox")

    with(dockerFiles) {
        from("docker")
    }
}
