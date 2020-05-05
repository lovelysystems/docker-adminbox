plugins {
    id("com.lovelysystems.gradle") version ("1.3.0")
}

lovely {
    gitProject()
    dockerProject("lovelysystems/adminbox")

    with(dockerFiles) {
        from("docker")
    }
}
