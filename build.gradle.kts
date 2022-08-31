plugins {
    id("com.lovelysystems.gradle") version ("1.9.1")
}

lovely {
    gitProject()
    dockerProject("lovelysystems/adminbox")

    with(dockerFiles) {
        from("docker")
    }
}
